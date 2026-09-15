package org.example;

import java.util.Scanner;
// Programa em Java usando o método tradicional
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        System.out.println("Boas vindas ao fantástico mundo do Java!!");
        int idade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        idade = entrada.nextInt();
        System.out.println();
        System.out.println("A idade informada foi " + idade + " anos");
    }
}
