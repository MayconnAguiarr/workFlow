package model;

import com.sun.deploy.util.StringUtils;

//@Entity
public class Ingrediente {

    private String nome;

    private Integer quantidade;

    Ingrediente(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new RuntimeException("Name cannot be null");
        }

        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
