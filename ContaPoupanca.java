package T1_POO;

public class ContaPoupanca extends ContaBancaria{
        private int diaRendimento;

        public ContaPoupanca(String nome, String numeroConta, double saldo, int diaRendimento) {
            super(nome, numeroConta, saldo);
            this.diaRendimento = diaRendimento;
        }

        public void calcularNovoSaldo(double taxaRendimento) {
            if (taxaRendimento > 0) {
                saldo += saldo * (taxaRendimento / 100);
                System.out.println("Rendimento aplicado. Novo saldo: R$" + saldo);
            } else {
                System.out.println("Taxa de rendimento inválida.");
            }
        }

    }

