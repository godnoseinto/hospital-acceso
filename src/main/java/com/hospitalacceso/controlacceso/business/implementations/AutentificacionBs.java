package com.hospitalacceso.controlacceso.business.implementations;

import com.hospitalacceso.controlacceso.core.entities.Usuario;
import com.hospitalacceso.controlacceso.core.repositories.AutentificacionRepository;
import com.hospitalacceso.controlacceso.core.services.AutenticacionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutentificacionBs implements AutenticacionService {

    @Autowired
    AutentificacionRepository autentificacionRepository;

    @Override
    @Transactional(rollbackOn = Exception.class)
    public Usuario getBy(String nickname, String paswword) {
        return autentificacionRepository.findBy(nickname,paswword);
    }
}
