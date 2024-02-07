/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herext01;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class HerExt01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Barco> barcos = new ArrayList<>();

        barcos.add(new Barco("123", 5, 2020));
        barcos.add(new Velero(5, "124", 6, 2020));
        barcos.add(new BarcoMotor(200, "125", 7, 2020));
        barcos.add(new Yate(4, 264, "8", 2020, 240));
        barcos.add(new Yate(2, 265, "9", 2020, 250));
        Alquiler a = new Alquiler();
        
 
        for (int i = 0; i < barcos.size(); i++) {
            a.calcularAlquiler(barcos.get(i));
        }
    }
    
}
