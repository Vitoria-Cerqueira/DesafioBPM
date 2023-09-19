package org.example.ex1;

public class BiggerNumber {
    public String getTheBiggestNumber(int numberOne, int numberTwo){
        if (numberOne > numberTwo){
            return numberOne + " é o maior numero";
        }else {
            return numberTwo + " é o maior numero";
        }
    }
}
