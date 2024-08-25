package com.hospitalacceso.controlacceso.core.repositories;

import com.hospitalacceso.controlacceso.core.entities.Usuario;

public interface AutentificacionRepository {

    Usuario findBy(String nickname, String correo);

}
