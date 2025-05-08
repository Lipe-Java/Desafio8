package desafio8;

import java.util.Scanner;

public class Desafio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantas vezes você quer somar os valores");
        int nVezes = input.nextInt();
        somarLista(nVezes);
    }
    public static void somarLista(int nVezes) {
          Scanner input = new Scanner(System.in);
          int soma = 0;
        for(int contador = 0; contador < nVezes; contador++) {
            System.out.println("Digite o "+(contador + 1)+" valor:");
            int valores = input.nextInt();
            soma+= valores;
        }
        System.out.println("A soma dos valores é:"+soma);
    }
}
