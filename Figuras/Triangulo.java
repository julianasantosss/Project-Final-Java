package Figuras;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }


}
