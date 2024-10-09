package Figuras;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo( double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
