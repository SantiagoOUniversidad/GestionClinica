package co.edu.uniquindio.gestionclinica.Model;
import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString

public class Factura {
    private LocalDate fecha;
    private String id;
    private double total;
    private double subtotal;
}
