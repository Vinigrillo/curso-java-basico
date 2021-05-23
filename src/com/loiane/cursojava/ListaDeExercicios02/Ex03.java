package com.loiane.cursojava.ListaDeExercicios02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o seu sexo (M/F): ");
        String sexo = scan.next();
        if (sexo.equalsIgnoreCase("f")) {
            System.out.println("Seu sexo é feminino");
        } else if (sexo.equalsIgnoreCase("m")) {
            System.out.println("Seu sexo é masculino");
        } else {
            System.out.println("Você Digitou valor inválido!");
        }

    }
}