package org.example.ex3;

public class VowelConsonant {
    public void checkLetters(char letters) {
        if (Character.isLetter(letters) && letters != ' ') {
            char lowerCaseLetra = Character.toLowerCase(letters);
            if (lowerCaseLetra == 'a' || lowerCaseLetra == 'e' || lowerCaseLetra == 'i' ||
                    lowerCaseLetra == 'o' || lowerCaseLetra == 'u') {
                System.out.println("É uma vogal.");
            } else {
                System.out.println("É uma consoante.");
            }
        } else {
            System.out.println("Por favor, digite uma única letra válida.");
        }
}}
