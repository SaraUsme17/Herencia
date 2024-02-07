/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enum.EstadoCivil;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected int id;
    protected EstadoCivil estadoCivil;

    Scanner leer = new Scanner(System.in);
    List<Persona> personas = new ArrayList();
    public Persona() {
    }

    public Persona(String nombre, String apellido, int id, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", estadoCivil=" + estadoCivil + '}';
    }
    
//    public void crearPersonas(){
//
//        
//        Persona p1 = new Persona("Juan", "Perez", 123, EstadoCivil.SOLTERO);
//        Persona p2 = new Persona("Felipe", "Arias", 456, EstadoCivil.CASADO);
//        Persona p3 = new Persona("Sara", "Lopez", 768, EstadoCivil.UNIONLIBRE);
//        personas.add(p1);
//        personas.add(p2);
//        personas.add(p3);
//        System.out.println("Lista de personas creada");
//    
//    }

//    public void mostrarPersonas() {
//        System.out.println("Lista de personas");
//        for (Persona persona : personas) {
//            System.out.println(persona);
//
//        }
//    }
    
    public void cambiarEstado(EstadoCivil nuevoEstado) {
        System.out.println("Ingrese el id de la persona a la que le quiere cambiar el estado civil");
        int id = leer.nextInt();
        boolean encontrada = false;
        for (Persona persona : personas) {
            if (persona.getId() == id) {
                persona.setEstadoCivil(nuevoEstado);
                encontrada = true;
                
            }
            
        }
        
        if(!encontrada){
            System.out.println("La persona no ha sido encontrada");
        }else{
            System.out.println("Estad civil cambiado con éxito");
        
        }
        

    }
        
//    setEstadoCivil(nuevoEstado);
    
    
    
}
