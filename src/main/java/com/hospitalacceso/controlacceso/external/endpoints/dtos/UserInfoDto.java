package com.hospitalacceso.controlacceso.external.endpoints.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "UserInfo", description = "Objecto que posee información relevante para quien consuma el endpoint de inicio de sesión")
public class UserInfoDto {

    @JsonProperty
    @Schema(description = "Atributo que representa el identificador del usuario que ingreso")
    private Integer id;

    @JsonProperty
    @Schema(description = "Atributo que representa el correo del usuario que ingreso")
    private String correo;

}
