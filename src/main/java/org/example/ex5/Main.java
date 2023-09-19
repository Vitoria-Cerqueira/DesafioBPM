package org.example.ex5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(9);
        numeros.add(1);
        numeros.add(7);

        ListDescending listDescending = new ListDescending(numeros);
        listDescending.ordenar();

        System.out.println("Lista ordenada de forma decrescente: " + listDescending.getNumbers());
    }
}
