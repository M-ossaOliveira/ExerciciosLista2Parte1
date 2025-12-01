package apllication;

import entities.Carro;
import entities.Veiculo;

public class Program {
    public static void main(String[] args) {
        /*8. Veículos e Subtipos (Nível Intermediário):
        Implemente uma classe base Veiculo (atributos: marca,
         modelo - ambos protected). Crie a subclasse Carro que adiciona um
         atributo private numeroPortas. Utilize construtores em ambas as classes
          e use super() no construtor de Carro para inicializar os atributos
          herdados.
        */

        Carro c =new Carro("Volkswagen","Gol",4);
        System.out.println("O carro é um "+c.getModelo()+" da marca "+c.getMarca()+" tem "+ c.getNumeroDePortas()+" portas");

    }
}
