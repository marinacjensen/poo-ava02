import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Responsavel extends Pessoa {

    public Responsavel(String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
    }

    public String getIdentificacao() {
        return nome + " - CPF: " + cpf;
    }

    public Exame realizarAgendamentoExame(String nomeExame, Paciente paciente, LocalDate data, LocalTime hora) {
    Exame exame = new Exame(nomeExame, this, paciente, data, hora);
    System.out.println("Exame agendado com sucesso.");
    return exame;
}

}
