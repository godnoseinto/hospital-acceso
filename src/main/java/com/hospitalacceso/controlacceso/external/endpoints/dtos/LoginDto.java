package com.hospitalacceso.controlacceso.external.endpoints.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hospitalacceso.controlacceso.core.entities.Login;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "Login", description = "Objecto utilizado para el inicio de sesión")
public class LoginDto {

    @JsonProperty
    @Schema(description = "Atributo que representa el usuario o correo electrónico para el inicio de sesion")
    private String user;

    @JsonProperty
    @Schema(description = "Atributo que representa el password cifrado para el inicio de sesión")
    private String password;

    public Login toEntity(){
        return Login.builder()
                .user(user)
                .password(password)
                .build();
    }

}
