package org.example.desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a distancia total percorrida em (km): ");
        int averageConsumption = scan.nextInt();

        System.out.println("Digite o total de combustivel consumido (litros): ");
        double fuelConsumed = scan.nextDouble();

        Car car = new Car(averageConsumption,fuelConsumed);
        car.calculatorAverageConsumption();
        System.out.println("Consumo médio: " + car.getAverageConsumption() + " km/l");

    }
}
