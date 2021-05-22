package com.loiane.cursojava.ListaDeExercicios;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua temperatura em  graus Farenheit?");
        Double F = scan.nextDouble();

        Double C = (5*(F-32)/9);

        System.out.println("A temperatura em Graus Celsius é: " + C);
    }
}
