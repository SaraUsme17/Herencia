/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interfaces.CalculosFormas;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Circulo implements CalculosFormas {
    
    private double radio;

    Scanner leer = new Scanner(System.in);
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", leer=" + leer + '}';
    }

    

    @Override
    public void calcularArea() {

        double area = PI * Math.pow(this.radio, 2);
        System.out.println("El área del circulo es " + area);
         
    }

    @Override
    public void calcularPerimetro() {
        
        double perimetro = PI*2*this.radio;
        System.out.println("El perímetro del circulo es " + perimetro);
        
    }
    
    
}
