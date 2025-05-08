package desafio8exer5;

import java.util.Scanner;

public class Desafio8Exer5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite algo");
        String algo = input.nextLine();
        System.out.println("A mensagem invertida:"+inverterTexto(algo));
    }
    public static String inverterTexto(String algo) {
        String invertida = new StringBuilder(algo).reverse().toString();
        return invertida;
    }
}
