package com.loiane.cursojava.ListaDeExercicios;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Valor do lado de um Quadrado: ");
        Double lado = scan.nextDouble();
        Double area = lado*lado;
// Double dobroArea = area*2;
        System.out.println("A área do quadrado é de " + area + "M²");
        System.out.println("O dobro da área do quadrado é de " + (area * 2) + "M²");
    }
}
