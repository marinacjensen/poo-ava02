import java.time.LocalDate;
import java.time.LocalTime;

public interface IAgendavel {

    void agendar(LocalDate data, LocalTime hora) throws AgendaNaoDisponivelException;
    void cancelar();

    String getResumo();
}

