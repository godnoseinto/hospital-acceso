package com.hospitalacceso.controlacceso.external.database.dao;

import com.hospitalacceso.controlacceso.core.entities.Usuario;
import com.hospitalacceso.controlacceso.core.repositories.AutentificacionRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public class AutentificacionDao implements AutentificacionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Usuario findBy(String nickname, String correo) {
        Stream<Object[]> result = entityManager.createNativeQuery("select tx_nickname, tx_correo_inicio from tac01_usuario where tx_nickname=:nick")
                .setParameter("nick",nickname).getResultStream();
        var usuario = result.map(r -> Usuario
                .builder()
                .nickname((String) r[0])
                .correo((String) r[1])
                .build()).findFirst();
        return usuario.isPresent()? usuario.get(): null;
    }

}
