package com.loiane.cursojava.aula12;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
//
//        //Leitura de Qualquer tipo de dado informado
//        System.out.println("Digite seu nome completo:");
//        String nomeCompleto = scan.nextLine();
//        System.out.println("Seu nome completo é: " + nomeCompleto);
//
//        //Apenas o primeiro String
//        System.out.println("Digite seu primeiro nome:");
//        String primeiroNome = scan.next();
//        System.out.println("Seu primeiro nome é: " + primeiroNome);
//
//        //Leitura de Int
//        System.out.println("Digite a sua idade:");
//        int idade = scan.nextInt();
//        System.out.println("Sua idade é: "+ idade);
//
//        //Leitura Double
//        System.out.println("Digite sua altura:");
//        double altura = scan.nextDouble();
//        System.out.println("Sua altura é: "+ altura);

        System.out.println("Digite o seu primeiro nome,idade,quantidade de filhos, altura e se tem bichinho de estimação:");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();
        System.out.println("Você digitou os seguintes valores:");
        System.out.println("Primeiro Nome: "+ primeiroNome);
        System.out.println("Idade: "+ idade);
        System.out.println("Quantidade de filhos: "+ qtdFilhos);
        System.out.println("Altura: "+altura);
        System.out.println("Tem bichinho de estimação: "+ temPet);

    }
}
