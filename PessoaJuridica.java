package T1_POO;

public class PessoaJuridica extends Contribuinte {
    public PessoaJuridica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public double calcularImposto() {
        return rendaBruta * 0.10;
    }
}
