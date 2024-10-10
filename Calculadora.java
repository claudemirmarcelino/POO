package T1_POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {
    private List<Double> numeros;

    public Calculadora() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(double numero) {
        numeros.add(numero);
    }

    public double somar() {
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        return soma;
    }

    public double subtrair() {
        if (numeros.isEmpty()) {
            return 0;
        }
        double subtracao = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            subtracao -= numeros.get(i);
        }
        return subtracao;
    }

    public double multiplicar() {
        if (numeros.isEmpty()) {
            return 0;
        }
        double produto = 1;
        for (double num : numeros) {
            produto *= num;
        }
        return produto;
    }

    public double dividir() {
        if (numeros.isEmpty()) {
            return 0;
        }
        double divisao = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) == 0) {
                System.out.println("Erro: Divisão por zero não é permitida.");
                return 0;
            }
            divisao /= numeros.get(i);
        }
        return divisao;
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu de Operações:");
            System.out.println("1. Adicionar número");
            System.out.println("2. Somar");
            System.out.println("3. Subtrair");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("6. Exibir lista de números");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite um número para adicionar: ");
                    double numero = scanner.nextDouble();
                    adicionarNumero(numero);
                    System.out.println("Número adicionado!");
                }
                case 2 -> System.out.println("Resultado da soma: " + somar());
                case 3 -> System.out.println("Resultado da subtração: " + subtrair());
                case 4 -> System.out.println("Resultado da multiplicação: " + multiplicar());
                case 5 -> System.out.println("Resultado da divisão: " + dividir());
                case 6 -> System.out.println("Números atuais: " + numeros);
                case 7 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.exibirMenu();
    }
}
