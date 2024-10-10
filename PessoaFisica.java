package T1_POO;

public class PessoaFisica extends Contribuinte {
    public PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public double calcularImposto() {
        double imposto = 0.0;

        if (rendaBruta <= 1400) {
            imposto = 0.0;
        } else if (rendaBruta <= 2100) {
            imposto = (rendaBruta * 0.10) - 100;
        } else if (rendaBruta <= 2800) {
            imposto = (rendaBruta * 0.15) - 270;
        } else if (rendaBruta <= 3600) {
            imposto = (rendaBruta * 0.25) - 500;
        } else {
            imposto = (rendaBruta * 0.30) - 700;
        }

        return Math.max(imposto, 0); 
    }
}
