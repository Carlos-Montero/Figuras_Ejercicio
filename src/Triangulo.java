/**
 * Created by Carlos on 01/03/2017.
 */
public class Triangulo implements Figura {
    private double altura;
    private double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double area() {
        return ((this.base * this.altura) / 2);
    }
}
