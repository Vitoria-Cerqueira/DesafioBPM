package org.example.desafio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor inteiro de 0 a 13: ");
        int number = scan.nextInt();

        factorialCalculator.verification(number);
    }
}
