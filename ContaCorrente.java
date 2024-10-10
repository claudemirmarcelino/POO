package T1_POO;

public class ContaCorrente extends Conta implements Tributavel {
    @Override
    public double calculaTributos() {
        return saldo * 0.01;
    }

    @Override
    public String toString() {
        return "ContaCorrente com saldo = " + saldo + ", Tributo = " + calculaTributos();
    }
}

