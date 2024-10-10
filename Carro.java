package T1_POO;

public class Carro {
    private String placa;
    private int marcha;

    public Carro(String placa) {
        this.placa = placa;
        this.marcha = 0; // Carro começa em ponto morto
    }

    public void ligar() {
        System.out.println("Carro ligado.");
    }

    public void trocarMarcha(int marcha) {
        this.marcha = marcha;
        System.out.println("Marcha trocada para: " + marcha);
    }

    public void acelerar() {
        if (marcha > 0) {
            System.out.println("Carro acelerando na marcha " + marcha + ".");
        } else {
            System.out.println("Não é possível acelerar em ponto morto.");
        }
    }

    public void frear() {
        System.out.println("Carro freando.");
    }

    public void desligar() {
        System.out.println("Carro desligado.");
    }
}
