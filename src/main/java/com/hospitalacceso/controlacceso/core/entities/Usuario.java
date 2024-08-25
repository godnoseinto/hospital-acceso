package com.hospitalacceso.controlacceso.core.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Usuario {

    private String nickname;
    private String correo;
}
