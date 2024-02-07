/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package her01;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author user
 */
public class Her01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal perro1 = new Perro("Sticht", "Carne", 15, "Doberman");
        perro1.alimenta();
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuaha");
        perro2.alimenta();
        Animal gato = new Gato("Pelusa", "Galletas", 15, "siames");
        gato.alimenta();
        Animal caballo= new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.alimenta();
        
    }
    
}
