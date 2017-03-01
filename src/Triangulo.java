/**
 * Created by Carlos on 01/03/2017.
 */
public class Triangulo implements Figura {
    double altura;
    double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double area() {
        return ((base * altura) / 2);
    }
}
