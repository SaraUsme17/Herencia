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
public class Profesor extends Empleado {
    
    private String departamento;

    public Profesor(String departamento, int anioIncor, int numDespacho, String nombre, String apellido, int id, EstadoCivil estadoCivil) {
        super(anioIncor, numDespacho, nombre, apellido, id, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{"+ "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", estadoCivil=" + estadoCivil  + ", departamento=" + departamento + '}';
    }
    
    
}
