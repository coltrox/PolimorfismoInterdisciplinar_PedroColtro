package model.geometria;

public class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void descricao() {
        System.out.println("Figura: Quadrado - 4 lados iguais.");
    }
}
