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
public class BarcoMotor extends Barco{
    
    private int potencia;

    public BarcoMotor(int potencia, String matricula, int slora, int anio) {
        super(matricula, slora, anio);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "potencia=" + potencia + '}';
    }

    @Override
    public int modulo() {
        return super.modulo() + this.potencia; //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
