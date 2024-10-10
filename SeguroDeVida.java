package T1_POO;

public class SeguroDeVida implements Tributavel {
    @Override
    public double calculaTributos() {
        return 42.0;
    }

    @Override
    public String toString() {
        return "SeguroDeVida com tributo fixo de R$ 42.0";
    }
}
