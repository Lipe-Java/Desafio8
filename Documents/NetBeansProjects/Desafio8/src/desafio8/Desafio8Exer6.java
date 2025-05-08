package desafio8exer6;

import java.util.Scanner;

public class Desafio8Exer6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma quantidade de metros");
        double metros = input.nextDouble();
        System.out.println("O valor em km é:"+ conversorKM(metros));
    }
    public static double  conversorKM(double metros) {
        double calculo;
        calculo = metros / 1000;
        return calculo;
    }
}
