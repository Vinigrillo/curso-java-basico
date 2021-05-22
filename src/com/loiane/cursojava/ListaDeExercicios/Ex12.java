package com.loiane.cursojava.ListaDeExercicios;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        Double altura = scan.nextDouble();
        Double pesoIdeal = (72.2*altura)-58;
        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}
