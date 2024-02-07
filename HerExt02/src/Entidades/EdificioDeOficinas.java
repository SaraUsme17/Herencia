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
public class EdificioDeOficinas extends Edificio{
    
    private int oficinas;
    private int personasOficina;
    private int pisos;
    
    Scanner leer = new Scanner(System.in);

    public EdificioDeOficinas() {
    }


   
    public EdificioDeOficinas(int oficinas, int personasOficina, int pisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.oficinas = oficinas;
        this.personasOficina = personasOficina;
        this.pisos = pisos;
    }

    public int getOficinas() {
        return oficinas;
    }

    public void setOficinas(int oficinas) {
        this.oficinas = oficinas;
    }

    public int getPersonasOficina() {
        return personasOficina;
    }

    public void setPersonasOficina(int personasOficina) {
        this.personasOficina = personasOficina;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    public void cantPersonas(){
//        System.out.println("Ingrese cuántas personas entran en cada oficina");
//        setPersonasOficina(leer.nextInt());
//        System.out.println("Ingrese la cantidad de oficinas por piso");
//        setOficinas(leer.nextInt());
//        System.out.println("Ingrese la cantidad de pisos");
//        setPisos(leer.nextInt());
//        
        
        int cantidadPiso = this.oficinas * this.personasOficina;
        int cantidadPersonas = this.pisos*cantidadPiso;
        
        System.out.println("La cantidad de personas que caben en el edificio es igual a " + cantidadPersonas);
        System.out.println("La cantidad de personas que caben por piso es igual a " + cantidadPiso);
    
    }
    

    @Override
    public void calcularSuperficie() {
        double superficie = this.alto * this.ancho * this.pisos;
        System.out.println("La superficie del Edificio de oficinas es igual a " + superficie + " m2");
    }

    @Override
    public void calcularVolumen() {
        double volumen = this.alto*this.ancho*this.largo*this.pisos;
        System.out.println("El volúmen del  Edificio de oficinas es igual a " + volumen + " m3");
        
    }
    
    
}
