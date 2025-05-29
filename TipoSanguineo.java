public enum TipoSanguineo {
    A_NEGATIVO("A-"),
    A_POSITIVO("A+"),
    O_NEGATIVO("O-"),
    O_POSITIVO("O+"),
    B_NEGATIVO("B-"),
    B_POSITIVO("B+"),
    AB_NEGATIVO("AB-"),
    AB_POSITIVO("AB+");

    private final String desc;

    TipoSanguineo(String descricao) {
        this.desc = descricao;
    }

    public String getDescricao() {
        return this.desc;
    }

    // Método para buscar o enum pela descrição
    public static TipoSanguineo fromDescricao(String descricao) {
        for (TipoSanguineo tipo : TipoSanguineo.values()) {
            if (tipo.getDescricao().equalsIgnoreCase(descricao)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo inválido: " + descricao);
    }
}
