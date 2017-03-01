/**
 * Created by Carlos on 01/03/2017.
 */
public class Cuadrado extends Rectangulo {
    double lado;

    public Cuadrado(double lado1, double lado2, double lado) {
        super(lado1, lado2);
        this.lado = lado;
    }

    public double area(){
        return lado*lado;
    }
}
