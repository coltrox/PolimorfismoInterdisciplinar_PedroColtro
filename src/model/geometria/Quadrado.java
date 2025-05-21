package model.geometria;

// Classe Quadrado que herda de FiguraGeometrica
public class Quadrado extends FiguraGeometrica {
    // Atributo específico do quadrado
    private double lado;

    // define o lado e chama o construtor da superclasse com o nome "Quadrado"
    public Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }

    // método abstrato para calcular a área do quadrado
    @Override
    public double calcularArea() {
        // Fórmula da área do quadrado: lado²
        return lado * lado;
    }

    // método abstrato para exibir uma descrição
    @Override
    public void descricao() {
        // Exibe uma descrição simples do quadrado
        System.out.println("Figura: Quadrado - 4 lados iguais.");
    }
}
