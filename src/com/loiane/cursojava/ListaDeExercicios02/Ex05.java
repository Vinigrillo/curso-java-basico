package com.loiane.cursojava.ListaDeExercicios02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a Nota1: ");
        double n1 = scan.nextDouble();

        System.out.println("Entre com a Nota2: ");
        double n2 = scan.nextDouble();

        double media = (n1 + n2) / 2;

        if (media >= 7 && media < 10) {
            System.out.println("Aprovado!");
        } else if (media < 7) {
            System.out.println("Reprovado!");
        } else if (media == 10) {
            System.out.println("Aprovado com distinção!");
        }
    }
}