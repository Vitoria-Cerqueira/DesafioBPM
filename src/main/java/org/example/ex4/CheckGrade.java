package org.example.ex4;

public class CheckGrade {
    public void check(double grade) {
        if (grade >= 0 && grade <= 10) {
            if (grade >= 8) {
                System.out.println("Aprovado");
            } else if (grade >= 6) {
                System.out.println("Em recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }else {
            System.out.println("Nota fora do intervalo válido.");
        }
    }
}

