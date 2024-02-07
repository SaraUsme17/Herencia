/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herext02;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class HerExt02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Edificio> edificios = new ArrayList();
        Polideportivo p1 = new Polideportivo("Poli", "Techado", 20, 20, 20);
        Polideportivo p2 = new Polideportivo("Deportivo", "Abierto", 30, 40, 10);
         Polideportivo p3 = new Polideportivo("Deportivo", "Abierto", 45, 10, 30);
        EdificioDeOficinas eof1 = new EdificioDeOficinas(10, 3, 10, 15, 15, 10);
        EdificioDeOficinas eof2 = new EdificioDeOficinas(5, 2, 7, 3, 35, 20);
        
       
        edificios.add(p1);
        edificios.add(p2);
        edificios.add(p3);
        edificios.add(eof1);
        edificios.add(eof2);
        
        int cantidadT =0;
        int cantidadA =0;
        
        for (Edificio edificio : edificios) {
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
            if(edificio instanceof Polideportivo){
                
                if(((Polideportivo) edificio).getInstalacion().equalsIgnoreCase("techado")){
                    cantidadT = cantidadT +1;
            
                } else if (((Polideportivo) edificio).getInstalacion().equalsIgnoreCase("abierto")) {
                    cantidadA = cantidadA + 1;
                }
        
            
            }
            if(edificio instanceof EdificioDeOficinas){
                ((EdificioDeOficinas) edificio).cantPersonas();
            
            }
        }
        
        System.out.println("La cantidad de techados es " + cantidadT);
        System.out.println("La cantidad de abiertos es " + cantidadA);
        

    }
    
}
