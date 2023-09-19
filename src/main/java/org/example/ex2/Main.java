package org.example.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckPositiveNegative checkPositiveNegative = new CheckPositiveNegative();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = scan.nextInt();
        System.out.println(checkPositiveNegative.checkNumber(number));
    }



}
