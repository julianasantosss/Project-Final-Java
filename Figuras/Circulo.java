package Figuras;

public class Circulo extends Figura implements Movible, Dibujable {
    private double radio;

    public Circulo(String color, double x, double y, double radio) {
        super(color, x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void moverHorizontalmente(int distancia) {
        this.x += distancia;
    }

    @Override
    public void moverVerticalmente(int distancia) {
        this.y += distancia;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo de radio " + radio);
    }

    @Override
    public void rotar() {
        System.out.println("Rotando el círculo");
    }
}
