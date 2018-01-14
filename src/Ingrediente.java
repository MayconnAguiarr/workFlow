public class Ingrediente {

    public String nome;

    public Integer quantidade;

    public Ingrediente(String nome) {
        this.nome = nome;
    }

    public Ingrediente(String nome, Integer quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
}
