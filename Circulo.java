package T1_POO;

public class Circulo implements AreaCalculavel {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    @Override
    public double calculaArea() {
        return Math.PI * raio * raio;
    }
    @Override
    public String toString() {
        return "Círculo com raio = " + raio + " e área = " + calculaArea();
    }
}

