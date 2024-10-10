package T1_POO;

public class Retangulo implements AreaCalculavel {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double calculaArea() {
        return base * altura;
    }
    @Override
    public String toString() {
        return "Retângulo com base = " + base + ", altura = " + altura + " e área = " + calculaArea();
    }
}

