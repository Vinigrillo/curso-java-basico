package com.loiane.cursojava.ListaDeExercicios02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um valor: ");
        int valor = scan.nextInt();

        if(valor >= 0){
            System.out.println("O valor é positivo");
        } else{
            System.out.println("O valor é negativo");
        }
    }
}
