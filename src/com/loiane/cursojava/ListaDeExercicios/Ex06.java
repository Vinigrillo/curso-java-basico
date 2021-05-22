package com.loiane.cursojava.ListaDeExercicios;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Valor do raio de uma circunferência: ");
        Double raio = scan.nextDouble();
        Double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área da sua circunferencia é de " + area + "M²");
    }
}
