package org.example.ex5;

import java.util.Collections;
import java.util.List;

public class ListDescending {
    private List<Integer> numbers;

    public ListDescending(List<Integer> numeros) {
        this.numbers = numeros;
    }

    public void ordenar() {
        Collections.sort(numbers, Collections.reverseOrder());
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
