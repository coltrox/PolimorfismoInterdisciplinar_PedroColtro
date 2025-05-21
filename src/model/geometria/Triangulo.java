package model.geometria;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super("Triângulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void descricao() {
        System.out.println("Figura: Triângulo - Três lados.");
    }
}
