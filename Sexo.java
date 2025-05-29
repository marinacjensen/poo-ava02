public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    OUTRO("Outro");

    private final String desc;

    Sexo(String descricao) {
        this.desc = descricao;
    }

    public String getDescricao() {
        return desc;
    }

    public static Sexo fromDescricao(String descricao) {
        for (Sexo sexo : Sexo.values()) {
            if (sexo.getDescricao().equalsIgnoreCase(descricao)) {
                return sexo;
            }
        }
        throw new IllegalArgumentException("Sexo inválido: " + descricao);
    }
}
