import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        /*1. Calculadora Simples (Nível Básico):
        Crie uma classe Calculadora com métodos public
        estáticos (somar, subtrair, multiplicar, dividir)
        que aceitam dois números inteiros e retornam o resultado.
        O metodo principal (main) deve chamar cada metodo e imprimir a saída.*/

        Scanner leia = new Scanner(System.in);
        int x, y;
        int escolha;

        System.out.println("Digite dois inteiros x y");
        x=leia.nextInt();
        System.out.println("Digite o método desejado");
        y=leia.nextInt();
        System.out.println("1 - para soma");
        System.out.println("2 - para subtração");
        System.out.println("3 - para divisão");
        System.out.println("4 - para multiplicação");
        escolha=leia.nextInt();
        switch (escolha){
            case 1: {
                System.out.println("A soma vale "+soma(x, y));
                break;
            }
            case 2: {
                System.out.println("A subtração vale "+subtracao(x, y));
                break;
            }
            case 3: {
                System.out.println("A divisão vale "+divisao(x, y));
                break;
            }
            case 4: {
                System.out.println("A multiplicação vale "+multiplicacao(x, y));
                break;
            }

        }

        leia.close();

    }

    //Havia dado problema porque não havia declarado os métodos como statis
    // assim resolveu
    static int soma(int a, int b){
        return a+b;
    }

    static int subtracao(int a, int b){
        return a-b;
    }

    static int divisao(int a, int b){
        return a/b;
    }
    static int multiplicacao(int a, int b){
        return a*b;
    }
}


