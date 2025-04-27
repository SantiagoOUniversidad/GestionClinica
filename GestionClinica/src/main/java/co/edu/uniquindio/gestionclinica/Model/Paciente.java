package co.edu.uniquindio.gestionclinica.Model;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString

public class Paciente {
    private String telefono;
    private String nombre;
    private String cedula;
    private String email;
    private Suscripcion suscripcion;
}
