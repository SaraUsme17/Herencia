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
public class Televisor extends Electrodomestico{
    
    protected double resolucion;
    protected boolean TDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean TDT, String color, char consumoEnergetico, double peso) {
        super(color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    
    public void crearTelevisor(){
        super.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas");
        setResolucion(leer.nextDouble());
        String respuesta;

        do {
            System.out.println("Tiene TDT (si/no)");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("si")) {
                setTDT(true);

            }
            if (respuesta.equalsIgnoreCase("no")) {
                setTDT(false);
            } else {
                System.out.println("Opción incorrecta");

            }
        } while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));


    
    
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
                if (this.resolucion > 40) {
            precio = this.precio *1.3;

        }if(this.TDT){
            precio = this.precio + 500;
        }
    }

    @Override
    public String toString() {
        return super.toString()+  " resolucion=" + resolucion + ", TDT=" + TDT + '}';
    }

       
}
