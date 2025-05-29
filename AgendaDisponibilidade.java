import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class AgendaDisponibilidade {
    Map<LocalDate, Map<LocalTime, Boolean>> agenda = new HashMap<>();

    public void abrirAgenda(LocalDate data) {
        Map<LocalTime, Boolean> horarios = new HashMap<>();
        LocalTime hora = LocalTime.of(9, 0);

        while (!hora.isAfter(LocalTime.of(17, 0))) {
            horarios.put(hora, true); // true = disponível
            hora = hora.plusHours(1);
        }

        agenda.put(data, horarios);
    }

    public void listarHorarios(LocalDate data) {
        Map<LocalTime, Boolean> horarios = agenda.get(data);
        if (horarios != null) {
            System.out.println("Horários para " + data + ":");
            for (Map.Entry<LocalTime, Boolean> entry : horarios.entrySet()) {
                System.out.println(entry.getKey() + " - " + (entry.getValue() ? "Disponível" : "Ocupado"));
            }
        } else {
            System.out.println("Agenda não disponível para " + data);
        }
    }

    public void agendar(LocalDate data, LocalTime hora) throws Exception {
        Map<LocalTime, Boolean> horarios = agenda.get(data);
        if (horarios == null || !horarios.containsKey(hora)) {
            throw new AgendaNaoDisponivelException("Horário não existe na agenda do dia " + data);
        }
        if (!horarios.get(hora)) {
            throw new AgendaNaoDisponivelException("Horário " + hora + " já está ocupado no dia " + data);
        }
        horarios.put(hora, false);
        System.out.println("Agendamento realizado para " + data + " às " + hora);
    }
}
