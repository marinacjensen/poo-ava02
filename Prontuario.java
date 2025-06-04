public class Prontuario {
    private Consulta consulta;
    private String sintomas;
    private String examesSolicitados;
    private String medicamentos;

    public Prontuario(Consulta consulta, String sintomas, String examesSolicitados, String medicamentos) {
        this.consulta = consulta;
        this.sintomas = sintomas;
        this.examesSolicitados = examesSolicitados;
        this.medicamentos = medicamentos;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public String getSintomas() {
        return sintomas;
    }

    public String getExamesSolicitados() {
        return examesSolicitados;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    @Override
    public String toString() {
        return "Prontuário:\n" +
               "Consulta: " + consulta.getResumo() + "\n" +
               "Sintomas: " + sintomas + "\n" +
               "Exames Solicitados: " + examesSolicitados + "\n" +
               "Medicamentos: " + medicamentos;
    }
}
