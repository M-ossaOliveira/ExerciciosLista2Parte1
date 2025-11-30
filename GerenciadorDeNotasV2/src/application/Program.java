package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);//para mostrar boolean c pontos
        Scanner k = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome=k.nextLine();
        System.out.println("Digite a nota da P1");
        double N1=k.nextDouble();
        System.out.println("Digite a nota da P2");
        double N2=k.nextDouble();
        Aluno aluno = new Aluno(nome,N1,N2);
        double media= aluno.calcularMedia(aluno.getN1(), aluno.getN2());
        boolean isAproRepro=aluno.isAprovado(aluno.getN1(), aluno.getN2());
        String AproRepro=aluno.Conceito(aluno.getN1(), aluno.getN2());
        System.out.println(aluno.toString());



        k.close();
    }
}
