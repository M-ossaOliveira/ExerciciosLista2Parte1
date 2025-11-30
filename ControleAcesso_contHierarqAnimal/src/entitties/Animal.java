package entities;

public abstract class Animal {

    private int numeroPatas=4;

    public String getNumeroPatas() {
        return String.format("%s",numeroPatas);
    }

    public abstract String emitirSom();
    //não tem corpo


    public void dormir(){
        System.out.println("ZzZzZzZz");
    }


}
