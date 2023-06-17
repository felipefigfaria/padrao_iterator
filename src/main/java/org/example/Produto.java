package org.example;

public class Produto {

    private String nome;
    private boolean outlet;

    public Produto(String nome, boolean outlet) {
        this.nome = nome;
        this.outlet = outlet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isOutlet() {
        return outlet;
    }

    public void setOutlet(boolean outlet) {
        this.outlet = outlet;
    }
}