package com.loiane.cursojava.ListaDeExercicios;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho do arquivo: ");
        double tamArquivo = scan.nextDouble();

        System.out.println("Entre com a velocidade da internet: ");
        double velInternet = scan.nextDouble();

        double tempo = tamArquivo / velInternet;

        System.out.println("Tempo de download: "+ tempo);
    }
}
