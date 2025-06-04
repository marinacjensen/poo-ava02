import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta implements IAgendavel {
    private LocalDate data;
    private LocalTime hora;
    private TipoConsulta tipo;
    private Medico medico;
    private Paciente paciente;
    private Prontuario prontuario;

    public Consulta(Medico medico, Paciente paciente, TipoConsulta tipo) {
        this.medico = medico;
        this.paciente = paciente;
        this.tipo = tipo;
    }

    @Override
    public void agendar(LocalDate data, LocalTime hora) throws AgendaNaoDisponivelException {
        medico.agendarConsulta(data, hora); 
        this.data = data;
        this.hora = hora;
    }



    @Override
    public String getResumo() {
        return "Consulta com " + medico.getNome() + 
               " para " + paciente.getNome() + 
               " em " + data + " às " + hora + 
               ", Tipo: " + tipo.getDescricao();
    }

        public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void encerrarConsulta(Consulta detalhes, String sintomas, String examesSolicitados, String medicamentos) {
        this.prontuario = new Prontuario(detalhes, sintomas, examesSolicitados, medicamentos);
        paciente.adicionarConsultaNoHistorico(this);
        System.out.println("Consulta encerrada e prontuário gerado.");
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    // toString
    @Override
    public String toString() {
        return "Consulta com " + medico.getNome() +
               ", Paciente: " + paciente.getNome() +
               ", Data: " + data +
               ", Hora: " + hora +
               ", Tipo: " + tipo.getDescricao() +
               (prontuario != null ? ", Prontuário gerado." : ", Prontuário: [Pendente]");
    }
}
