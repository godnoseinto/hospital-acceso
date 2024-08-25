package com.hospitalacceso.controlacceso.external.database.maps;

import com.hospitalacceso.controlacceso.core.entities.Usuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@Table(name = "tac01_usuario")
public class UsuarioTbl {

    @Id
    @Column(name = "id_usuario")
    private Integer id;

    @Column(name = "tx_nickname")
    private String nickname;

    @Column(name = "tx_correo_inicio")
    private String correo;

    @Column(name = "tx_password")
    private String password;

    public Usuario toEntity(){
        return Usuario.builder()
                .nickname(nickname)
                .correo(correo)
                .build();
    }



}
