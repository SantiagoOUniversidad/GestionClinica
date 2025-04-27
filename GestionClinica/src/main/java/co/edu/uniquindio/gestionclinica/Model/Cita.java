package co.edu.uniquindio.gestionclinica.Model;
import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString

public class Cita {
    private Paciente paciente;
    private String id;
    private LocalDate fecha;
    private Servicio servicio;
    private Factura factura;
}
