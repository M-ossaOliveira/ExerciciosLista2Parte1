package application;

import entities.Funcionario;
import entities.Gerente;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        System.out.println("Vamos inicializar os dados de um funcionário");
        String nome, RG, idFirma, cargo;
        double salario;
        System.out.println("Entre com nome");
        nome=s.nextLine();
        System.out.println("Entre com RG");
        RG=s.nextLine();
        System.out.println("Entre com ID da firma");
        idFirma=s.nextLine();
        System.out.println("Entre com cargo");
        cargo=s.nextLine();
        System.out.println("Entre com salario");
        salario=s.nextDouble();

        cargo=cargo.toLowerCase();
        System.out.println("cargo"+cargo);

        if (cargo.equals("gerente")){
            Gerente g = new Gerente(nome, RG,idFirma,salario,cargo);
            String st=g.toString();
            System.out.println(st);
        }else {
            Funcionario f = new Funcionario(nome,RG,idFirma,salario);
            String st=f.toString();
            System.out.println(st);
        }


        s.close();
    }
}
