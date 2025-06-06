import java.time.LocalDate;
import java.time.LocalTime;

public class Tecnico extends Responsavel {

    public Tecnico(String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
    }

    @Override
    public String toString() {
        return "Técnico: " + nome +
                ", CPF: " + cpf +
                ", Email: " + email +
                ", Telefone: " + telefone;
    }

}
