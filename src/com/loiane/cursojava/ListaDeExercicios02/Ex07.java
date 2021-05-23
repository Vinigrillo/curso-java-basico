package com.loiane.cursojava.ListaDeExercicios02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o N1: ");
        double n1 = scan.nextDouble();
        System.out.println("Entre com o N2: ");
        double n2 = scan.nextDouble();
        System.out.println("Entre com o N3: ");
        double n3 = scan.nextDouble();


        if (n1 > n2 && n1 > n3){
            System.out.println("O maior número é: "+ n1);
        } else if (n2 > n1 && n2 > n3){
            System.out.println("O maior número é: "+ n2);
        } else {
            System.out.println("O maior número é: "+ n3);
        }

        if (n1 < n2 && n1 < n3){
            System.out.println("O menor número é: "+ n1);
        } else if (n2 < n1 && n2 < n3){
            System.out.println("O menor número é: "+ n2);
        } else {
            System.out.println("O menor número é: "+ n3);
        }
    }

}
