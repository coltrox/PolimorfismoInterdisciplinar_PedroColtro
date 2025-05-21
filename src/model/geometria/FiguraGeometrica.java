package model.geometria;

// Classe abstrata base para representar figuras geométricas
public abstract class FiguraGeometrica {
    // Atributo comum a todas as figuras: o nome
    protected String nome;

    // define o nome da figura
    public FiguraGeometrica(String nome) {
        this.nome = nome;
    }

    // Método abstrato que será implementado pelas subclasses para calcular a área
    public abstract double calcularArea();

    // Método abstrato que será implementado pelas subclasses para exibir uma descrição
    public abstract void descricao();
}
