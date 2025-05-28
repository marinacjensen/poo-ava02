public enum TipoSanguineo {
    A_NEGATIVO("A-"),
    A_POSITIVO("A+"),
    O_NEGATIVO("O-"),
    O_POSITIVO("O+"),
    B_NEGATIVO("B-"),
    B_POSITIVO("B+"),
    AB_NEGATIVO("AB-"),
    AB_POSITIVO("AB+");

    private final String descricao;

    TipoSanguineo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    // Método para buscar o enum pela descrição
    public static TipoSanguineo fromDescricao(String descricao) {
        for (TipoSanguineo tipo : TipoSanguineo.values()) {
            if (tipo.getDescricao().equalsIgnoreCase(descricao)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo sanguíneo inválido: " + descricao);
    }
}
