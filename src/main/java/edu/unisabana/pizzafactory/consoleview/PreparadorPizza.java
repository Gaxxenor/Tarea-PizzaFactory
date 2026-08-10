package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.AFabricaPizza;
import edu.unisabana.pizzafactory.model.AmasadorPizza;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.FabricaPizzaGruesa;
import edu.unisabana.pizzafactory.model.Horneador;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Moldeador;
import edu.unisabana.pizzafactory.model.Tamano;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    public static void main(String args[]) {
        try {
            Ingrediente[] ingredientes = new Ingrediente[]{new Ingrediente("queso", 1), new Ingrediente("jamon", 2)};
            PreparadorPizza pp = new PreparadorPizza();

            // Seleccionamos la fábrica deseada (puedes cambiarla por FabricaPizzaIntegral, etc.)
            AFabricaPizza fabrica = new FabricaPizzaGruesa();

            pp.prepararPizza(ingredientes, Tamano.MEDIANO, fabrica);
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
    }

    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam, AFabricaPizza fabrica)
            throws ExcepcionParametrosInvalidos {
        
        // Se obtienen los componentes a través de la fábrica abstracta
        AmasadorPizza am = fabrica.crearAmasador();
        Horneador hpd = fabrica.crearHorneador();
        Moldeador mp = fabrica.crearMoldeador();

        am.amasar();
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.molderarPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:" + tam);
        }
        aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}