package desafio8exer7;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafio8Exer7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        System.out.println("Digite o raio da esfera");
        double raio = input.nextDouble();
        System.out.println("O volume da esfera é:" + decimal.format(calcularVolume(raio)));
    }

    public static double calcularVolume(double raio) {
        double calculo;
        calculo = (4 / 3) * Math.PI * Math.pow(raio, 3);
        return calculo;
    }
}
