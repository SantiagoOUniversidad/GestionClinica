package co.edu.uniquindio.gestionclinica.Model;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString

public class Servicio {
    private double precio;
    private String id;
    private String nombre;
}
