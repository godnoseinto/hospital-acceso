package com.hospitalacceso.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(produces="application/json")
public class DemoCtrl {

    @PostMapping(value = "/hello")
    public ResponseEntity<EntidadDemo> hello(@RequestBody EntidadDemo entidadDemo) {
        return ResponseEntity.ok(EntidadDemo.builder()
                        .nombre(String.format("Hello %s!", entidadDemo.getNombre()))
                .build());
    }

}
