package model.geometria;

public abstract class FiguraGeometrica {
    protected String nome;

    public FiguraGeometrica(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();
    public abstract void descricao();
}
