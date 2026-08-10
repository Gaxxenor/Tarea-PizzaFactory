package edu.unisabana.pizzafactory.model;

public class MoldeadorPizzaIntegral implements Moldeador {

    @Override
    public void moldearPizzaPequena() {
        System.out.println("Moldeando pizza integral pequeña...");
    }

    @Override
    public void molderarPizzaMediana() { // Cambiado a molderar con 'er'
        System.out.println("Moldeando pizza integral mediana...");
    }

}