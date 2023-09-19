package org.example.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BiggerNumber maiorMenor = new BiggerNumber();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int number1 = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        int number2 = scan.nextInt();
        System.out.println(maiorMenor.getTheBiggestNumber(number1,number2));

    }



}
