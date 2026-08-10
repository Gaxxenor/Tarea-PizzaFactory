package edu.unisabana.pizzafactory.model;

public class HorneadorPizzaGruesa implements Horneador {

    @Override
    public void hornear() {
        System.out.println("Horneando pizza de masa gruesa...");
    }

}