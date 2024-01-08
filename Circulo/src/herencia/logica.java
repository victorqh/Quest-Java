package herencia;

public class logica {
    public double calcArea(double radio){
        return Math.PI*Math.pow(radio, 2);
    }

    public double calcPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }
}
