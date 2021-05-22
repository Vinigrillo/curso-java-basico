package com.loiane.cursojava.ListaDeExercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite N1:");
        Double n1 = scan.nextDouble();
        System.out.println("Digite N2:");
        Double n2 = scan.nextDouble();
        System.out.println("Digite N3:");
        Double n3 = scan.nextDouble();
        System.out.println("Digite N4:");
        Double n4 = scan.nextDouble();
        Double soma = n1+n2+n3+n4;
        Double media = soma/4;
        System.out.println("Sua Média é: " + media);


    }
}
