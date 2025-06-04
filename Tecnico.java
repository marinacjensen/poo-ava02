public class Tecnico extends Pessoa {

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
