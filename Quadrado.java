package T1_POO;

public class Quadrado implements AreaCalculavel {
    private double lado;
    public Quadrado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calculaArea() {
        return lado * lado;
    }
    @Override
    public String toString() {
        return "Quadrado com lado = " + lado + " e área = " + calculaArea();
    }
}
