/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author user
 */
public final class Polideportivo extends Edificio{
    
    private String nombre;
    private String instalacion;

    public Polideportivo() {
    }


    public Polideportivo(String nombre, String instalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
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

    

    @Override
    public void calcularSuperficie() {
        double superficie = this.alto * this.ancho;
        System.out.println("La superficie del Polideportivo es igual a " + superficie + " m2");
        
    }

    @Override
    public void calcularVolumen() {
        double volumen = this.alto*this.ancho*this.largo;
        System.out.println("El volúmen del Polideportivo es igual a " + volumen + " m3");
        
    }
    
}
