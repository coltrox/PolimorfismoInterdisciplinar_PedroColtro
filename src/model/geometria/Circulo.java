package model.geometria;

public class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public void descricao() {
        System.out.println("Figura: Círculo - Formato arredondado.");
    }
}
