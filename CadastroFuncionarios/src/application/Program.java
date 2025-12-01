package application;

import entities.Gerente;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Vamos inicializar os dados de um gerente");
        String nome, RG, idFirma, cargo;
        System.out.println("Entre com nome");
        nome=s.nextLine();
        System.out.println("Entre com RG");
        RG=s.nextLine();
        System.out.println("Entre com ID da firma");
        idFirma=s.nextLine();
        System.out.println("Entre com cargo");
        cargo=s.nextLine();
        Gerente g = new Gerente(nome,RG,idFirma,cargo);
        String st=g.toString();
        System.out.println(st);
        s.close();
    }
}
