package T1_POO;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("1234", "Mouse sem fio", 5, 35.90);

        System.out.println("Fatura 1:");
        fatura1.exibirFatura();

        fatura1.setQuantidadeComprada(-10); 
        fatura1.setPrecoPorItem(45.0);     

        System.out.println("\nFatura 1 após alterações:");
        fatura1.exibirFatura();

        Fatura fatura2 = new Fatura("5678", "Teclado mecânico", -2, -100.00);
        
        System.out.println("\nFatura 2:");
        fatura2.exibirFatura();
        }
    }

