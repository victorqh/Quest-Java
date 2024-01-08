package herencia;

public class circuloAt {
    private double radio;

    public circuloAt(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "circuloAt{" +
                "radio=" + radio +
                '}';
    }
}
