/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package her04;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author user
 */
public class Her04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo c = new Circulo(2);
        c.calcularArea();
        c.calcularPerimetro();
        Rectangulo r = new Rectangulo(2,2);
        r.calcularArea();
        r.calcularPerimetro();
    }
    
}
