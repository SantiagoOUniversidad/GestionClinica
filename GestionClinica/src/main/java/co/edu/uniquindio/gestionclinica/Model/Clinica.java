package co.edu.uniquindio.gestionclinica.Model;
import java.util.List;
import lombok.*;

@AllArgsConstructor
@Getter

public class Clinica {
    private List<Cita> citas;
    private List<Servicio> servicios;
    private List<Paciente> pacientes;

    public void registrarPaciente(Paciente paciente) throws Exception {
        if (paciente != null) {
            pacientes.add(paciente);
        } else {
            throw new Exception("El paciente esta vacio");
        }
    }

    public void registrarCita(Cita cita) throws Exception {
        if (cita != null) {
            citas.add(cita);
        } else {
            throw new Exception("La cita esta vacia");
        }
    }

    public void registrarServicio(Servicio servicio) throws Exception {
        if (servicio != null) {
            servicios.add(servicio);
        } else {
            throw new Exception("El servicio esta vacio");
        }
    }
}
