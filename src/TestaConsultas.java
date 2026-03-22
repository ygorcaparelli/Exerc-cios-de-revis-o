import java.time.LocalDateTime;

public class TestaConsultas {
    public static void main(String[] args) {
        Medico medico = new Medico(1, "Dra. Mariana Silva", "Cardiologia");
        Paciente paciente = new Paciente(1, "Joao Pereira", "123.456.789-00");

        Consulta consulta = new Consulta(
                LocalDateTime.of(2026, 5, 20, 10, 0),
                250.0,
                medico,
                paciente
        );

        System.out.println(consulta);
    }
}
