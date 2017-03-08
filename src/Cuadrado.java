/**
 * Created by Carlos on 01/03/2017.
 */
public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {

        this.lado = lado;
    }

    public double area(){
        return this.lado*this.lado;
    }
}
