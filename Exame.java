import java.time.LocalDate;
import java.time.LocalTime;

public class Exame implements IAgendavel{

    @Override
    public void agendar(LocalDate data, LocalTime hora) throws AgendaNaoDisponivelException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agendar'");
    }

    @Override
    public void cancelar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelar'");
    }

    @Override
    public String getResumo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResumo'");
    }
    
}
