public abstract class Responsavel extends Pessoa {

    public Responsavel(String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
    }

    public String getIdentificacao() {
        return nome + " - CPF: " + cpf;
    }
}
