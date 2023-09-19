package org.example.ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckGrade checkGrade = new CheckGrade();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota entre 0 e 10");
        double grade = scan.nextDouble();

        checkGrade.check(grade);
    }
}
