package org.example.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        VowelConsonant vowelConsonant = new VowelConsonant();

        System.out.println("Digite uma letra: ");
        char letter = scan.next().charAt(0);
        vowelConsonant.checkLetters(letter);

    }
}
