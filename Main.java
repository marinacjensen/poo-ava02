import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Medico medico1 = new Medico("Marina Jensen", "02502278007", "marina@email.com", "981194014", "12345");
        Paciente paciente1 = new Paciente("Vinícius Machado", "12345678900", "vinicius@email.com", "912345678",
                LocalDate.of(1990, 1, 1), Sexo.MASCULINO, TipoSanguineo.O_NEGATIVO);

        System.out.println(medico1.toString());
        System.out.println(paciente1.toString());

        medico1.abrirAgenda(LocalDate.of(2025, 6, 6));
        medico1.getAgenda().listarHorarios(LocalDate.of(2025, 6, 6));

        try {
            Consulta consulta = medico1.realizarAgendamentoConsulta(
                    paciente1,
                    LocalDate.of(2025, 6, 6),
                    LocalTime.of(9, 0),
                    TipoConsulta.PRIMEIRA_CONSULTA);

            System.out.println("Consulta agendada!");
            System.out.println(consulta);

            consulta.encerrarConsulta(consulta,
                    "Dor no joelho e inchaço.",
                    "Exame de sangue, Raio-X de joelho.",
                    "Ibuprofeno, Compressa de gelo.");

            System.out.println(consulta.getProntuario());

        } catch (AgendaNaoDisponivelException e) {
            System.out.println("Erro no agendamento: " + e.getMessage());
        }

        Tecnico tecnico = new Tecnico("Carlos Souza", "65432198700", "carlos@email.com", "11977777777");

        Paciente paciente = new Paciente(
                "João da Silva", "98765432100", "joao@email.com", "11988888888",
                LocalDate.of(1990, 5, 10),
                Sexo.MASCULINO,
                TipoSanguineo.O_POSITIVO);

        Exame exame = tecnico.realizarAgendamentoExame(
                "Raio-X de Tórax",
                paciente,
                LocalDate.of(2025, 6, 11),
                LocalTime.of(14, 0));

        System.out.println(exame);

        exame.encerrarExame("Raio-X sem alterações. Estruturas pulmonares preservadas.");

        System.out.println(exame);

        paciente1.listarHistoricoConsultas();

    }
}