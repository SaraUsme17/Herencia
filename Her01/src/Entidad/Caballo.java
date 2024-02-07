/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author user
 */
public class Caballo extends Animal {

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void alimenta() {
        System.out.println("Yo soy " + this.nombre + " de raza " + this.raza + " tengo " + this.edad + " años y me alimento de " + this.alimento);
    }
}
