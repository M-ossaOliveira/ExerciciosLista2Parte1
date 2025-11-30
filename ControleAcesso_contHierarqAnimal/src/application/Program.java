package application;

import entities.Gato;
import entities.Cachorro;

public class Program {

    public static void main(String[] args) {

        Gato g = new Gato("Bichano","Miau");
        Cachorro c = new Cachorro("Rex","AuAu");

        System.out.println("O cachorro "+c.getNome()+" emite o som");
        c.emitirSom();
        System.out.println("E quando dorme faz");
        c.dormir();
        System.out.println("Ele tem "+c.getNumeroPatas()+" patas");


        System.out.println("O gato "+g.getNome()+" emite o som");
        g.emitirSom();
        System.out.println("E quando dorme faz");
        g.dormir();
        System.out.println("Ele tem "+c.getNumeroPatas()+" patas");

    }
}
