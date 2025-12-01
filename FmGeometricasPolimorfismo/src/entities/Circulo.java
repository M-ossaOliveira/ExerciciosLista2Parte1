package entities;

public class Circulo extends Forma {

    private double raio;
    final double PI=3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area(){
        return PI*Math.pow(raio,2);
    }

    @Override
    public String toString(){
        return "O circulo de raio "+getRaio()+" tem area "+String.format("%.2f",area());
    }
}
