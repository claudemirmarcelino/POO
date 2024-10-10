package T1_POO;

public class EmpregadoTeste {
    public static void main(String[] args) {

        Empregado empregado1 = new Empregado("João", "Silva", 2500.00);
        Empregado empregado2 = new Empregado("Maria", "Oliveira", 3000.00);

        System.out.println("Salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": R$" + empregado1.getSalarioAnual());
        System.out.println("Salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": R$" + empregado2.getSalarioAnual());

        empregado1.aumentarSalario(10);
        empregado2.aumentarSalario(10);

        System.out.println("\nApós aumento de 10%:");
        System.out.println("Salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": R$" + empregado1.getSalarioAnual());
        System.out.println("Salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": R$" + empregado2.getSalarioAnual());
    }
}
    
