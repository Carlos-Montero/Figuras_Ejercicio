import static java.lang.Math.PI;/**
 * Created by Carlos on 01/03/2017.
 */
public class Circulo extends Figura {
    private double radio;


    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area(){

        return PI*(this.radio*this.radio);
    }
}

