package edu.unisabana.pizzafactory.model;

public class MoldeadorPizzaGruesa implements Moldeador {

    @Override
    public void moldearPizzaPequena() {
        System.out.println("Moldeando pizza gruesa pequeña...");
    }

    @Override
    public void molderarPizzaMediana() { // Cambiado a molderar con 'er'
        System.out.println("Moldeando pizza gruesa mediana...");
    }

}