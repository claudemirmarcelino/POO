package T1_POO;

public abstract class Contribuinte {
    protected String nome;
    protected double rendaBruta;

    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public String getNome() {
        return nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public abstract double calcularImposto();

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Renda Bruta: R$ " + rendaBruta);
        System.out.println("Imposto a pagar: R$ " + calcularImposto());
    }
}
