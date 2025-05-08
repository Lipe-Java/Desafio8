package desafio8exer1;

import java.util.Scanner;

public class Desafio8Exer1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int numero1 = input.nextInt();
        System.out.println("Digite o segundo número");
        int numero2 = input.nextInt();
        System.out.println("Digite o terceiro número");
        int numero3 = input.nextInt();
        mostrarMaior(numero1, numero2, numero3);
    }

    public static void mostrarMaior(int numero1, int numero2, int numero3) {
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("Número 1 é maior");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("Número 2 é maior");
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("Número 3 é maior");
            // Obs:Esse else if debaixo é pra caso nenhum número for maior que o outro.
        } else if (numero1 == numero2 && numero3 < numero1 && numero3 < numero2 || numero1 == numero3 && numero2 < numero1 && numero2 < numero3 || numero2 == numero3 && numero1 < numero2 && numero1 < numero3) {
            System.out.println("Nenhum número é maior que o outro");
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
