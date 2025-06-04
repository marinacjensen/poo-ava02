import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa {
    private String crm;
    private List<String> especialidades;
    private AgendaDisponibilidade agenda;

    public Medico(String nome, String cpf, String email, String telefone, String crm) {
        super(nome, cpf, email, telefone);
        this.crm = crm;
        this.especialidades = new ArrayList<>();
        this.agenda = new AgendaDisponibilidade();
    }

    String especialidadesStr = String.join(", ", especialidades);

    @Override
    public String toString() {
        return "Médica: " + nome +
                ", CPF: " + cpf +
                ", CRM: " + crm +
                ", Email: " + email +
                ", Telefone: " + telefone +
                ", Especialidades: " + especialidadesStr;
    }

    public void abrirAgenda(LocalDate data) {
        agenda.abrirAgenda(data);
    }

    // Getters e setters
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void adicionarEspecialidade(String especialidade) {
        this.especialidades.add(especialidade);
    }

    public AgendaDisponibilidade getAgenda() {
        return agenda;
    }

    public void agendarConsulta(LocalDate data, LocalTime hora) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agendarConsulta'");
    }
}
