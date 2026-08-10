package edu.unisabana.pizzafactory.model;

public interface AFabricaPizza {

    public AmasadorPizza crearAmasador();

    public Horneador crearHorneador();

    public Moldeador crearMoldeador();

}