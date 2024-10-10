package T1_POO;
public class Círculo {
    private float raio;
    public float calcularArea(){
        return (float) (Math.PI*raio*raio);
    }
    public float calcularPerimetro(){
        return (float) (2*Math.PI*raio);
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
