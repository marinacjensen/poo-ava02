import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {
    private LocalDate dtNascimento;
    private Sexo sexo;
    private TipoSanguineo tipoSanguineo;
    private List<Consulta> historicoConsultas;

    public Paciente(String nome, String cpf, String email, String telefone,
            LocalDate dtNascimento, Sexo sexo, TipoSanguineo tipoSanguineo) {
        super(nome, cpf, email, telefone);
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.tipoSanguineo = tipoSanguineo;
        this.historicoConsultas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Paciente: " + nome +
                ", CPF: " + cpf +
                ", Data de Nascimento: " + dtNascimento +
                ", Sexo: " + sexo.getDescricao() +
                ", Tipo Sanguíneo: " + tipoSanguineo.getDescricao() +
                ", Email: " + email +
                ", Telefone: " + telefone;
    }

    public void adicionarConsultaNoHistorico(Consulta consulta) {
        historicoConsultas.add(consulta);
    }

    public void listarHistoricoConsultas() {
        if (historicoConsultas.isEmpty()) {
            System.out.println("Não há consultas no histórico.");
        } else {
            for (Consulta c : historicoConsultas) {
                System.out.println(c.getResumo());
            }
        }
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public List<Consulta> getHistoricoConsultas() {
        return historicoConsultas;
    }
}
