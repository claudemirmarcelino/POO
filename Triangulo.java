package T1_POO;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public boolean isTrianguloValido() {
        return (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA);
    }

    public double calcularArea() {
        if (isTrianguloValido()) {
            double semiPerimetro = (ladoA + ladoB + ladoC) / 2;

            return Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC));
        } else {
            System.out.println("Os lados fornecidos não formam um triângulo válido.");
            return 0;
        }
    }


    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }


}

