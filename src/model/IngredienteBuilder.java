package model;

public class IngredienteBuilder {

    private String nome;

    private Integer quantidade;

    public IngredienteBuilder(){}

    public IngredienteBuilder(String nome) {
        this.nome = nome;
    }

    public IngredienteBuilder(String nome, Integer quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public IngredienteBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public IngredienteBuilder setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public Ingrediente build() {
        Ingrediente ingrediente = new Ingrediente(this.nome);
        ingrediente.setQuantidade(this.quantidade);

        return ingrediente;
    }
}
