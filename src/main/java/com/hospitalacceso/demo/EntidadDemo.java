package com.hospitalacceso.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "EntidadDemo", description = "Entidad utilizada para la demos de spring")
public class EntidadDemo {

    @JsonProperty
    @Schema(description = "utilizando el nombre para imprimir en el hello")
    private String nombre;
}
