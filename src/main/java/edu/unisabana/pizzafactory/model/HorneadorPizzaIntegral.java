package edu.unisabana.pizzafactory.model;

public class HorneadorPizzaIntegral implements Horneador {

    @Override
    public void hornear() {
        System.out.println("Horneando pizza de masa integral...");
    }

}