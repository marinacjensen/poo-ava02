import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Medico extends Responsavel {
    private String crm;
    private List<String> especialidades;
    private AgendaDisponibilidade agenda;

    public Medico(String nome, String cpf, String email, String telefone, String crm) {
        super(nome, cpf, email, telefone);
        this.crm = crm;
        this.especialidades = new ArrayList<>();
        this.agenda = new AgendaDisponibilidade();
    }

    @Override
    public String toString() {
        return "Médica: " + nome +
                ", CPF: " + cpf +
                ", CRM: " + crm +
                ", Email: " + email +
                ", Telefone: " + telefone +
                ", Especialidades: " + especialidades;
    }

    public void abrirAgenda(LocalDate data) {
        agenda.abrirAgenda(data);
    }

    public Consulta realizarAgendamentoConsulta(Paciente paciente, LocalDate data, LocalTime hora, TipoConsulta tipo)
            throws AgendaNaoDisponivelException {
        this.agenda.agendar(data, hora);
        Consulta consulta = new Consulta(this, paciente, data, hora, tipo);
        paciente.adicionarConsultaNoHistorico(consulta);
        return consulta;
    }

    public Exame realizarAgendamentoExame(String nomeExame, Paciente paciente, LocalDate data, LocalTime hora) {
        Exame exame = new Exame(nomeExame, this, paciente, data, hora);
        System.out.println("Exame agendado com sucesso.");
        return exame;
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

}
