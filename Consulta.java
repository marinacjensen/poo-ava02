import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta implements IAgendavel {

    private LocalDate data;
    private LocalTime hora;
    private TipoConsulta tpConsulta;
    private Medico medico;
    private Paciente paciente;
    private Prontuario prontuario;

    public void agendar(LocalDate data, LocalTime hora) throws AgendaNaoDisponivelException {
        
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
