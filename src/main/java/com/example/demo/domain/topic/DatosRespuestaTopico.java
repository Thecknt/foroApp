package com.example.demo.domain.topic;

public record DatosRespuestaTopico(

        Long id,

        String titulo,

        String mensaje,

        String fechaCreacion,

        Boolean activo,

        String usuario,

        String curso

) {
}
