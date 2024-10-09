package Figuras;

public abstract class Figura {
    protected String color;
    protected double x, y;

    public Figura(String color, double x, double y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
