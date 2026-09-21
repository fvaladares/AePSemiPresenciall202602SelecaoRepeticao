package org.example;

import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        String nome;

        System.out.print("Olá, por favor, informe seu nome: ");
        nome = entrada.nextLine(); // faz a leitura de uma linha de texto

        System.out.println();
        System.out.println("Olá " + nome + ", boas vindas ao Java!!!");

        System.out.print("\nOlá, por favor, informe sua idade: ");
        idade = entrada.nextInt();

        if (idade > 130) {
            System.out.println(nome + ", você é um Highlander?");
        } else if (idade >= 18) {
            System.out.println(nome + ", você é maior de idade.");
        } else if(idade >= 0) {
            System.out.println(nome + ", você é menor de idade.");
        } else {
            System.out.println(nome + ", sua idade não pode ser menor do que zero!");
        }
    }
}
