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
public class Estudiante extends Persona{
    
    private String curso;

    public Estudiante(String curso, String nombre, String apellido, int id, EstadoCivil estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{"+ "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", estadoCivil=" + estadoCivil  +  ", curso=" + curso + '}';
    }
    
    
}
