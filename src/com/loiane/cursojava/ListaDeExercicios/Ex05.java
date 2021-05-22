package com.loiane.cursojava.ListaDeExercicios;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma quantidade de Metros:");
        Double metros = scan.nextDouble();
        double centimetros = metros * 100;
        System.out.println(""+ metros +" metros equivale a "+centimetros+" centimetros");
    }
}
