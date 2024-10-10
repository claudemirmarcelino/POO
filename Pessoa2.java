package T1_POO;

public class Pessoa2 {
    private String nome;
    private Carro meuCarro;

    public Pessoa2(String nome, Carro meuCarro) {
        this.nome = nome;
        this.meuCarro = meuCarro;
    }

    public void ligarCarro() {
        System.out.println(nome + " está ligando o carro.");
        meuCarro.ligar();
    }

    public void trocarMarcha(int marcha) {
        System.out.println(nome + " está trocando a marcha para: " + marcha);
        meuCarro.trocarMarcha(marcha);
    }

    public void acelerar() {
        System.out.println(nome + " está acelerando o carro.");
        meuCarro.acelerar();
    }

    public void frear() {
        System.out.println(nome + " está freando o carro.");
        meuCarro.frear();
    }

    public void desligarCarro() {
        System.out.println(nome + " está desligando o carro.");
        meuCarro.desligar();
    }

    public static void main(String[] args) {
        Carro carro = new Carro("ABC-1234");
        Pessoa2 pessoa = new Pessoa2("João", carro);

        pessoa.ligarCarro();
        pessoa.trocarMarcha(1);
        pessoa.acelerar();
        pessoa.trocarMarcha(2);
        pessoa.acelerar();
        pessoa.frear();
        pessoa.desligarCarro();
    }
}
