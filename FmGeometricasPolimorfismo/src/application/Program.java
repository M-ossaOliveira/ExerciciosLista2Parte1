package application;

import entities.Forma;
import entities.Retangulo;
import entities.Circulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner=new Scanner(System.in);
        List<Forma> f = new ArrayList<>();
        char yn='y';

        while (yn=='y'){
            System.out.println("Deseja entrar com nova forma");
            System.out.println("Digite 'y' pra sim ou 'n' para não");
            yn=scanner.next().charAt(0);

            if(yn=='y'){
                System.out.println("Deseja incluir:");
                System.out.println("Digite c para círculo");
                System.out.println("Digite r para retângulo");
                char rc=scanner.next().charAt(0);

                if(rc=='r'){
                    System.out.println("Entre com a base");
                    double base=scanner.nextDouble();
                    System.out.println("Entre com a altura");
                    double altura=scanner.nextDouble();
                    Retangulo r = new Retangulo(base,altura);
                    f.add(r);
                }
                else if(rc=='c'){
                    System.out.println("Entre com o raio");
                    double raio=scanner.nextDouble();
                    Circulo c = new Circulo(raio);
                    f.add(c);
                }
            }
        }//fim while
        int cont =0;
        for (Forma fm : f){
            String aux=f.toString();
            cont++;
            if (cont==f.size()){
                System.out.println(aux);
            }

        }

        scanner.close();


    }

}
