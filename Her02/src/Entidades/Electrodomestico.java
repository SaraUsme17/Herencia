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
public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    Scanner leer = new Scanner(System.in);
    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumoEnergetico, double peso) {
        this.precio = 1000d;
        this.color = comprobarColor(color);
        this.consumoEnergetico =  comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    
    public char comprobarConsumoEnergetico(char letra){
        
        if (letra < 'A' || letra >'F'){
        letra = 'F';
        
        }
        return letra;
    
   
    }
    
    public String comprobarColor(String color){
        
        String [] colores = {"blanco", "negro", "rojo", "azul","gris"};
        for (int i = 0; i < colores.length; i++) {
            if(colores[i].equalsIgnoreCase(color)){
             color = colores[i];
            }else{
            color = "blanco";
            
            }
        
        }
        return color;
    
    
    }
    
    public void crearElectrodomestico(){
        setPrecio(1000d);
        System.out.println("Ingrese el color (blanco, negro, rojo, azul ó gris)");
        setColor( comprobarColor(leer.next()));
        System.out.println("Ingrese el consumo energético. Una letra que esté entre A y F");   
        setConsumoEnergetico(comprobarConsumoEnergetico(leer.next().charAt(0)));
        System.out.println("Ingrese el peso");
        setPeso(leer.nextDouble());
    
    }
    
    public void precioFinal(){
    
        switch(this.consumoEnergetico){
            case 'A': precio = this.precio +1000d;
            break;
            case 'B': precio = this.precio +800d;
            break;
            case 'C': precio = this.precio +600d;
            break;
            case 'D': precio = this.precio +500d;
            break;
            case 'E': precio = this.precio +300d;
            break;
            case 'F': precio = this.precio +100d;
            break;
            default:
            break;

        }
        
        if (this.peso >= 1 && this.peso <= 19) {
            precio = this.precio + 100;

        } else if (this.peso >= 20 && this.peso <= 49) {
            precio = this.precio + 500;

        } else if (this.peso >= 50 && this.peso <= 79) {
            precio = this.precio + 800;
        } else {
            precio = this.precio + 1000;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso ;
    }

}
