/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package her02;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Her02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Lavadora lv = new Lavadora();
//        Televisor tv = new Televisor();
//        lv.crearLavadora();
//        lv.precioFinal();
//        System.out.println(lv);
//        tv.crearTelevisor();
//        tv.precioFinal();
//        System.out.println(tv);
        
        
        List<Electrodomestico> electrodomesticos = new ArrayList();
        Lavadora lv1 = new Lavadora(47, "Gris", 'A', 50);
        Lavadora lv2 = new Lavadora(20, "Blanco", 'D',80);
        Televisor tv1 = new Televisor(50, true, "Negro", 'F', 20);
        Televisor tv2 = new Televisor(30, false, "Rojo", 'B', 45);
        
        electrodomesticos.add(lv1);
        electrodomesticos.add(lv2);
        electrodomesticos.add(tv1);
        electrodomesticos.add(tv2);
        
        double totalLv=0;
        double totalTv=0;
        double total = 0;
        
        for (Electrodomestico ele : electrodomesticos) {
            ele.precioFinal();
            System.out.println(ele);
            total = total + ele.getPrecio();
            if(ele instanceof Lavadora){
            totalLv = totalLv + ele.getPrecio();
            
            }else{
            totalTv = totalTv + ele.getPrecio();
            
            }

        }
        
        System.out.println("El precio total de todos los electrodomésticos es igual a " + total);
        System.out.println("El precio total de las lavadoras es igual a " + totalLv);
        System.out.println("El precio total de los televisores es igual a " + totalTv);
    }
    
    
}
