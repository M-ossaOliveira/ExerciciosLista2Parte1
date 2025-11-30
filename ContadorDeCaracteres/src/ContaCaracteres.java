import java.util.Scanner;
import java.lang.String;

public class ContaCaracteres {
    public static void main(String[] args) {
        // Conta quantos de um caractere dado char tem na string
        Scanner L = new Scanner(System.in);
        char busca;
        String conjCaracteres;
        int contador=0;

        System.out.println("Digite sua String");
        conjCaracteres=L.nextLine();
        System.out.println("Digite o char desejado");
        busca=L.next().charAt(0);
        L.close();
        for (int i=0;i<conjCaracteres.length();i++){
            if (conjCaracteres.charAt(i)==busca){
                contador+=1;
            }
        }
        System.out.println("O caracter "+busca+" aparece "+contador+ " vezes na String");

    }
}
