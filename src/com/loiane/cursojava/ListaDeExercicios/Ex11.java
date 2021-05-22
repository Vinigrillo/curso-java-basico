package com.loiane.cursojava.ListaDeExercicios;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero Inteiro: ");
        int n1 = scan.nextInt();

        System.out.println("Outro numero Inteiro: ");
        int n2 = scan.nextInt();

        System.out.println("Digite um numero Real: ");
        double n3 = scan.nextDouble();

        double A = (n1*2) * (n2/2);

        double B = (n1*3) + n3;

        double C = Math.pow (n3,3);

        System.out.println("O Produto do dobro do primeiro com metade do segundo é: "+ A);

        System.out.println("A soma do triplo do primeiro com terceiro é: " + B);

        System.out.println("O terceiro elevado ao cubo é :" + C);

    }
}
