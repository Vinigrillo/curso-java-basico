package com.loiane.cursojava.ListaDeExercicios02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor Produto1: ");
        double p1 = scan.nextDouble();
        System.out.println("Valor Produto2: ");
        double p2 = scan.nextDouble();
        System.out.println("Valor Produto3: ");
        double p3 = scan.nextDouble();

        if (p1 < p2 && p1 < p3){
            System.out.println("Você deve comprar o Produto1");
        } else if (p2 < p1 && p2 < p3){
            System.out.println("Você deve comprar o Produto2");
        } else {
            System.out.println("Você deve comprar o Produto3");
        }
    }
}
