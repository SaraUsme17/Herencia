/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herext04;

import Entidades.Empleado;
import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.PersonalServicio;
import Entidades.Profesor;
import Enum.EstadoCivil;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class HerExt04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        List<Persona> personas = new ArrayList();
        Persona p1 = new Persona("Juan", "Perez", 123, EstadoCivil.SOLTERO);
        Persona p2 = new Persona("Sara", "Lopez", 768, EstadoCivil.UNIONLIBRE);
        Empleado e1 = new Empleado(2020, 12, "Ana", "Cardenas", 590, EstadoCivil.VIUDO);
        Profesor pr1 = new Profesor("Matematicas", 2019, 15, "Andres", "Gomez", 543, EstadoCivil.SOLTERO);
        Estudiante es1 = new Estudiante("Ciencias","Felipe", "Arias", 456, EstadoCivil.CASADO);
        PersonalServicio ps = new PersonalServicio("biblioteca", 2015, 18, "Leo", "Arenas", 987, EstadoCivil.VIUDO);
        personas.add(p1);
        personas.add(p2);
        personas.add(e1);
        personas.add(pr1);
        personas.add(es1);
        personas.add(ps);

        
        System.out.println("Ingrese el id de la persona a la que le quiere cambiar el estado civil");
        int id = leer.nextInt();
        boolean encontrada = false;

        for (Persona per : personas) {
            if (per.getId() == id) {
                per.setEstadoCivil(EstadoCivil.SOLTERO);
                encontrada = true;
            }
            
            if (per instanceof Empleado) {
                ((Empleado) per).setNumDespacho(90);
            }
            
            if(per instanceof Estudiante){
            ((Estudiante) per).setCurso("Español");
            
            }
            
            if(per instanceof Profesor){
            ((Profesor) per).setDepartamento("Arquitectura");
            
            }
            
            if(per instanceof PersonalServicio){

            ((PersonalServicio) per).setSeccion("Oficina");
            }
        }
            if (!encontrada) {
                System.out.println("La persona no ha sido encontrada");
            } else {
                System.out.println("Estado civil cambiado con éxito");

            }

                for (Persona persona : personas) {
                System.out.println(persona);   
        }
    }
        



 
//mostrarMenu();

 
    }
//
