package org.example.desafio2;

public class FactorialCalculator {
    public int calculatorFactorial(int number){
        if (number == 0 || number == 1){
            return 1;
        }else {
            int fat = 1;

            for (int i = 1; i <= number; i++) {
                fat *= i;
            }
            return fat;
        }
    }
    public void verification(int n){
        if (n >= 0 && n < 13) {
            int resultado = calculatorFactorial(n);
            System.out.println(n + "! = " + resultado);
        } else {
            System.out.println("Valor fora do intervalo permitido.");
        }
    }
}
