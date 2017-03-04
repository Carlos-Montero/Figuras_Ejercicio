/**
 * Created by Carlos on 01/03/2017.
 */
public class Circulo implements Figura{
    private double radio;
    double pi=3.1416;

    public Circulo(double radio, double pi) {
        this.radio = radio;
        this.pi = pi;
    }

    public double area(){

        return this.pi*(this.radio*this.radio);
    }
}

