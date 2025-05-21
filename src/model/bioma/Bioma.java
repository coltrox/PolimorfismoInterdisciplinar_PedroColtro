package model.bioma;

public abstract class Bioma {
    protected String nome;
    protected String pais;

    public Bioma(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public abstract void descricao();
    public abstract void clima();
}
