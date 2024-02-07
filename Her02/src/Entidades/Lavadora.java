/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Lavadora extends Electrodomestico {
    
    protected double carga;
    
    Scanner leer = new Scanner(System.in);

    public Lavadora() {
    }

    
    public Lavadora(double carga, String color, char consumoEnergetico, double peso) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
    super.crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        setCarga(leer.nextDouble());
    
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
        if (this.carga > 30) {
            precio = this.precio + 500;

        } else {
            precio = this.precio;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " carga=" + carga + '}';
    }




}
