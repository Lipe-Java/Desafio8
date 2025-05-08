package desafio8exer2;

import java.util.Scanner;

public class Desafio8Exer2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite algo");
        String algo = input.nextLine();
        converteMaiusculaEConta(algo);
    }
    public static void converteMaiusculaEConta(String algo) {
        System.out.println("Sua mensagem em maiúsculo:"+algo.toUpperCase()+" e a quantidade de caracteres:"+algo.length());
    }
  }
