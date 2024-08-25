package com.hospitalacceso.controlacceso.core.entities;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Login {

    private String user;
    private String password;

}
