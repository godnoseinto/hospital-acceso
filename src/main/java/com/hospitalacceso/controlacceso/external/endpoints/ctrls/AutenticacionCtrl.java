package com.hospitalacceso.controlacceso.external.endpoints.ctrls;

import com.hospitalacceso.controlacceso.core.entities.Login;
import com.hospitalacceso.controlacceso.core.services.AutenticacionService;
import com.hospitalacceso.controlacceso.external.endpoints.dtos.UserInfoDto;
import com.hospitalacceso.utils.jwt.Message;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@CrossOrigin(origins = "*")
@RequestMapping(path = "/autenticacion",produces="application/json")
@Tag(name = "Autentificación", description = "Modulo de autentificación del usuario")
public class AutenticacionCtrl {

    @Autowired
    AutenticacionService autenticacionService;

    @GetMapping(value = "/login")
    public ResponseEntity<UserInfoDto> login(@RequestParam(required = true) String user,@RequestParam(required = true) String password) {
       var usuarioConsultado = autenticacionService.getBy(user, "");
       log.info("Usuario: "+usuarioConsultado.getNickname());
        return ResponseEntity.ok(UserInfoDto.builder()
                        .id(1)
                        .correo(usuarioConsultado.getCorreo())
                .build());
    }

    @GetMapping(value = "/public")
    public Message publicEndpoint() {
        return new Message("All good. You DO NOT need to be authenticated to call /api/public.");
    }

    @GetMapping(value = "/private")
    public Message privateEndpoint() {
        return new Message("All good. You can see this because you are Authenticated.");
    }

    @GetMapping(value = "/private-scoped")
    public Message privateScopedEndpoint() {
        return new Message("All good. You can see this because you are Authenticated with a Token granted the 'read:messages' scope");
    }


}
