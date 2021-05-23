package com.loiane.cursojava.ListaDeExercicios02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero: ");
        int n1 = scan.nextInt();

        System.out.println("Entre com outro numero: ");
        int n2 = scan.nextInt();

        if (n1 > n2){
            System.out.println("O numero "+ n1 +" é maior que o numero "+n2);
        } else{
            System.out.println("O numero " + n2 + " é maior que o numero " + n1);
        }
    }
}
