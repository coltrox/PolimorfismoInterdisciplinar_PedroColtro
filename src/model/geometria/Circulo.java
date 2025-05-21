package model.geometria;

// Classe Circulo que herda de FiguraGeometrica
public class Circulo extends FiguraGeometrica {
    // Atributo específico do círculo
    private double raio;

    // define o raio e passa o nome "Círculo" para a superclasse
    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    // método para calcular a área do círculo
    @Override
    public double calcularArea() {
        // Fórmula da área do círculo: π * raio²
        return Math.PI * raio * raio;
    }

    // método para exibir uma descrição da figura
    @Override
    public void descricao() {
        // Exibe uma descrição simples do círculo
        System.out.println("Figura: Círculo - Formato arredondado.");
    }
}
