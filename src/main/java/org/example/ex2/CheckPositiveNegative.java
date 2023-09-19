package org.example.ex2;

public class CheckPositiveNegative {
    public String checkNumber(int number){
        if (number > 0){
            return number + " é positivo";
        } else if (number < 0) {
            return number + " é negativo";
        }else {
            return number + " é zero";
        }
    }
}
