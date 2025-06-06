import java.time.LocalDate;
import java.time.LocalTime;

public class Exame implements IAgendavel {
    private String nome;
    private LocalDate data;
    private LocalTime hora;
    private Responsavel responsavel;
    private Paciente paciente;
    private String laudo;

        public Exame(String nome, Responsavel responsavel, Paciente paciente, LocalDate data, LocalTime hora) {
        this.nome = nome;
        this.responsavel = responsavel;
        this.paciente = paciente;
        this.data = data;
        this.hora = hora;
    }

    @Override
    public void agendar(LocalDate data, LocalTime hora) {
        this.data = data;
        this.hora = hora;
    }

    @Override
    public String getResumo() {
        return "Exame: " + nome +
               ", Paciente: " + paciente.getNome() +
               ", Responsável: " + responsavel.getNome() +
               ", Data: " + data +
               ", Hora: " + hora;
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

    public void encerrarExame(String laudo) {
        this.laudo = laudo;
        System.out.println("Exame encerrado e laudo gerado.");
    }

    public String getLaudo() {
        return laudo != null ? laudo : "[Laudo ainda não gerado]";
    }

    // toString
    @Override
    public String toString() {
        return "Exame: " + nome +
               ", Paciente: " + paciente.getNome() +
               ", Responsável: " + responsavel.getNome() +
               ", Data: " + data +
               ", Hora: " + hora +
               (laudo != null ? ", Laudo: " + laudo : ", Laudo: [Pendente]");
    }
}
