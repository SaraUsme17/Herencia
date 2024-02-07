/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package her1practico;

import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Her1Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Animal> lista = new ArrayList();
        
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        lista.add(a);
        lista.add(b);
        lista.add(c);
        
        for (Animal animal : lista) {
            a.hacerRuido();
            b.hacerRuido();
            c.hacerRuido();
        }
    }
    
}
