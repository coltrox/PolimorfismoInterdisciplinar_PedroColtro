package model.geometria;

// Classe Triangulo que herda de FiguraGeometrica
public class Triangulo extends FiguraGeometrica {
    // Atributos específicos do triângulo
    private double base;
    private double altura;

    // define a base, altura e o nome da figura
    public Triangulo(double base, double altura) {
        // Chama o construtor da classe mãe FiguraGeometrica com o nome "Triângulo"
        super("Triângulo");
        this.base = base;
        this.altura = altura;
    }

    // calcular a área do triangulo
    @Override
    public double calcularArea() {
        // Fórmula da área do triângulo: (base * altura) / 2
        return (base * altura) / 2;
    }

    // exibir uma descrição da figura
    @Override
    public void descricao() {
        // Exibe uma descrição do triângulo
        System.out.println("Figura: Triângulo - Três lados.");
    }
}
