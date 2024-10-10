package T1_POO;

public class ContaBancaria {
    protected String numeroConta;
    protected String nome;
    protected double saldo;

    public ContaBancaria(String nome2, String numeroConta2, double saldo2) {
        //TODO Auto-generated constructor stub
    }
    public double Deposito(double valor){
        return (double) (saldo + valor);
    }
    public double Saque(double valor){
        if (valor <= saldo) {
            System.out.println("Ação invalida");
            return 0;
        }
        return (double) (saldo - valor);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
