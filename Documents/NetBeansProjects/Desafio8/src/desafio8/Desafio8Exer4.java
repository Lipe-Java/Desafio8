package desafio8exer4;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Desafio8Exer4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        System.out.println("Digite o primeiro número fracionário");
        double nFracionario1 = input.nextDouble();
        System.out.println("Digite o segundo número fracionário");
        double nFracionario2 = input.nextDouble();
        System.out.println("Digite o terceiro número fracionário");
        double nFracionario3 = input.nextDouble();
        System.out.println("A média dos números é:"+decimal.format(calcularMedia(nFracionario1, nFracionario2, nFracionario3)));
    }

    public static double calcularMedia(double nFracionario1, double nFracionario2, double nFracionario3) {
        double media;
        media = (nFracionario1 + nFracionario2 + nFracionario3) / 3;
        return media;
    }
}
