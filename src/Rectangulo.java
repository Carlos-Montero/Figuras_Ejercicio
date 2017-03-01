/**
 * Created by Carlos on 01/03/2017.
 */
public class Rectangulo implements Figura {
    double lado1;
    double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double area(){

        return lado1*lado2;
    }
}
