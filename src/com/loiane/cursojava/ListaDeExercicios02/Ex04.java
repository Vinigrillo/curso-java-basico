package com.loiane.cursojava.ListaDeExercicios02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com uma letra: ");
        String letra = scan.next();

        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u": System.out.println("É uma vogal!"); break;
            default: System.out.println("É uma consoante!");
        }
    }
}
