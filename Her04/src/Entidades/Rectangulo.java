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
public class Rectangulo implements CalculosFormas{
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    Scanner leer = new Scanner(System.in);
    
    @Override
    public void calcularArea() {

        double area  = this.base*this.altura;
        System.out.println("El área del rectángulo es " + area);
    }

    @Override
    public void calcularPerimetro() {
     double perimetro  = (this.base+this.altura)*2;  
     System.out.println("El perímetro del rectángulo es " + perimetro);
    }
    
    
}
