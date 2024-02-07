/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enum.EstadoCivil;

/**
 *
 * @author user
 */
public class Empleado extends Persona{
    
    protected int anioIncor;
    protected int numDespacho;

    public Empleado(int anioIncor, int numDespacho, String nombre, String apellido, int id, EstadoCivil estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.anioIncor = anioIncor;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncor() {
        return anioIncor;
    }

    public void setAnioIncor(int anioIncor) {
        this.anioIncor = anioIncor;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    
    @Override
    public String toString() {
        return "Empleado{"+ "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", estadoCivil=" + estadoCivil  + " anioIncor=" + anioIncor + ", numDespacho=" + numDespacho + '}';
    }
    
        
    public void crearEmpleados(){

        
        Persona p1 = new Persona("Juan", "Perez", 123, EstadoCivil.SOLTERO);
        Persona p2 = new Persona("Felipe", "Arias", 456, EstadoCivil.CASADO);
        Persona p3 = new Persona("Sara", "Lopez", 768, EstadoCivil.UNIONLIBRE);
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        System.out.println("Lista creada");
    
    }

    
    
}
