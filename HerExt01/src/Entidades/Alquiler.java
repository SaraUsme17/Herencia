/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Alquiler {
    
    private String nombre;
    private int id;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private int posicion;
    
    Scanner leer = new Scanner(System.in);
    
    public void calcularAlquiler(Barco barco){
        
        System.out.println("Ingrese la fecha de inicio del alquiler (AAAA-MM-DD): ");
        String fechaInicioStr = leer.nextLine();
        LocalDate fechaInicio = LocalDate.parse(fechaInicioStr);

        System.out.println("Ingrese la fecha de devolución (AAAA-MM-DD): ");
        String fechaDevolucionStr = leer.nextLine();
        LocalDate fechaDevolucion = LocalDate.parse(fechaDevolucionStr);

        long diasDeOcupacion = ChronoUnit.DAYS.between(fechaInicio, fechaDevolucion);

        double costoAlquiler = diasDeOcupacion * barco.modulo();

        System.out.println("Costo del alquiler del "+barco+": " + costoAlquiler);
    }
    
    public void menuAlquiler(Velero velero, BarcoMotor barcoAMotor, Yate yate){

        boolean volverAlMenu = true;
        do {
            System.out.println("\nB A R C O S");
            System.out.println("Seleccione la embarcación: ");
            System.out.println("1 | Velero");
            System.out.println("2 | Barco a motor");
            System.out.println("3 | Yate de lujo");
            System.out.println("0 | Salir");
            int embarcacionElegida = leer.nextInt();
            leer.nextLine();

            switch (embarcacionElegida) {
                case 1:
                    calcularAlquiler(velero);
                    break;
                case 2:
                    calcularAlquiler(barcoAMotor);
                    break;
                case 3:
                    calcularAlquiler(yate);
                    break;
                case 0:
                    System.out.println("Saliendo...\nHasta pronto!");
                    volverAlMenu = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente nuevamente. ");
                    break;
            }
        } while (volverAlMenu);


    }
    
}
