public enum TipoConsulta {
    PRIMEIRA_CONSULTA("Primeira Consulta"),
    RETORNO("Retorno"),
    ACOMPANHAMENTO("Acompanhamento");

    private final String desc;

    TipoConsulta(String descricao) {
        this.desc = descricao;
    }

    public String getDescricao() {
        return desc;
    }

    public static TipoConsulta fromDescricao(String descricao) {
        for (TipoConsulta tipo : TipoConsulta.values()) {
            if (tipo.getDescricao().equalsIgnoreCase(descricao)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo inválido: " + descricao);
    }
}
