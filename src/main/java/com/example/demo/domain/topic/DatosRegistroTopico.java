package com.example.demo.domain.topic;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(

        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String fechaCreacion,

        Boolean activo,
        @NotBlank
        String usuario,
        @NotBlank
        String curso
) {


}
