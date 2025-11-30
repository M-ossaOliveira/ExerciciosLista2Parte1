import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //se ligada lampada == true
        // se desligada false

        Scanner s = new Scanner(System.in);
        System.out.println("Diga se a lâmpada está ligada ou deslidaga");
        System.out.println("true==acesa && false==apagada");
        boolean trueFalse=s.nextBoolean();
        Lampada l= new Lampada(trueFalse);
        if (trueFalse){
            System.out.println("Está acesa");
        }else{
            System.out.println("Está apagada");
        }
        System.out.println("O estado alternado ao desta lâmpada é");
        trueFalse=l.alternarEstado(trueFalse);
        if(trueFalse){
            System.out.println("Acesa");
        }
        else{
            System.out.println("Apagada");
        }
    }
}
