package com.loiane.cursojava.ListaDeExercicios;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu salario por hora?");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas horas trabalhadas por mes?");
        Double horas = scan.nextDouble();

        double salarioBruto = valorHora*horas;
        double inss = salarioBruto*0.08;
        double sindicato = salarioBruto*0.05;
        double ir = salarioBruto*0.11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto-totalDescontos;

        System.out.println("Salário bruto:" +salarioBruto);
        System.out.println("INSS: "+ inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("IR: " + ir);
        System.out.println("Total descontos: " + totalDescontos);
        System.out.println("Salario Líquido: "+ salarioLiquido);
    }
}
