package com.loiane.cursojava.ListaDeExercicios;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu salario por hora?");
        Double valorHora = scan.nextDouble();

        System.out.println("Quantas horas trabalhadas por mes?");
        Double horas = scan.nextDouble();

        Double salario = valorHora*horas;

        System.out.println("Seu salário mensal é de R$" + salario);
    }
}
