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
public class PersonalServicio extends Empleado{
    
    private String seccion;

    public PersonalServicio(String seccion, int anioIncor, int numDespacho, String nombre, String apellido, int id, EstadoCivil estadoCivil) {
        super(anioIncor, numDespacho, nombre, apellido, id, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "PersonalServicio{"+ "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", estadoCivil=" + estadoCivil  +  ", seccion=" + seccion + '}';
    }
    
    
    
}
