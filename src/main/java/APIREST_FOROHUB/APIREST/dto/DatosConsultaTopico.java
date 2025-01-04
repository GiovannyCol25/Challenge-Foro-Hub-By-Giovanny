package APIREST_FOROHUB.APIREST.dto;

import java.time.LocalDateTime;

public record DatosConsultaTopico(
        String titulo,
        String mensaje,
        LocalDateTime fecha_Creacion,
        boolean status,
        String autor,
        String curso
) {

}
