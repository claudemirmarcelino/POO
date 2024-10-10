package T1_POO;

import java.time.LocalDate;
import java.time.Year;

public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public int calcularIdade() {
        int anoAtual = LocalDate.now().getYear();
        int anoNascimento = anoAtual - idade;
        int count = 0;

        for (int ano = anoNascimento; ano <= anoAtual; ano++) {
            if (Year.of(ano).isLeap()) {
                count++;
            }
        }
        return count;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + profissao);
        System.out.println("Anos Bissextos Vividos: " + calcularIdade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}