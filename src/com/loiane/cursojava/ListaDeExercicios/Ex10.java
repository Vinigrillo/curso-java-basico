package com.loiane.cursojava.ListaDeExercicios;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua temperatura em  graus Celsius?");
        Double C = scan.nextDouble();

        Double F = (C*9/5)+32;

        System.out.println("A temperatura em Graus Farenheit é: " + F);

    }
}
