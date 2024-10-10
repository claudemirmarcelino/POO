package T1_POO;

public class Teste {
    public static void main(String[] args) {
        PessoaFisica pf1 = new PessoaFisica("Carlos Silva", 1800.00);
        PessoaFisica pf2 = new PessoaFisica("Ana Souza", 2500.00);
        PessoaFisica pf3 = new PessoaFisica("Mariana Costa", 3200.00);

        PessoaJuridica pj1 = new PessoaJuridica("Empresa Alpha", 50000.00);
        PessoaJuridica pj2 = new PessoaJuridica("Empresa Beta", 75000.00);
        PessoaJuridica pj3 = new PessoaJuridica("Empresa Gama", 120000.00);

        Contribuinte[] contribuintes = {pf1, pf2, pf3, pj1, pj2, pj3};

        System.out.println("Dados e Impostos dos Contribuintes:");
        for (Contribuinte contribuinte : contribuintes) {
            contribuinte.mostrarDados();
            System.out.println("---------------------------");
        }
    }
}
