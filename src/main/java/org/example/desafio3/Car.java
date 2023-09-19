package org.example.desafio3;

public class Car {
    private int travelledDistance;
    private double fuelConsumed;
    private double averageConsumption;

    public Car(int travelledDistance, double fuelConsumed) {
        this.travelledDistance = travelledDistance;
        this.fuelConsumed = fuelConsumed;
    }
    public void calculatorAverageConsumption(){
        averageConsumption = travelledDistance / fuelConsumed;
    }

    public double getAverageConsumption() {
        return averageConsumption;
    }
}
