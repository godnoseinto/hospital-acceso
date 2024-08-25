package com.hospitalacceso.controlacceso.core.services;

import com.hospitalacceso.controlacceso.core.entities.Usuario;

public interface AutenticacionService {

    Usuario getBy(String nickname, String password);

}
