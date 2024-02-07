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
public class Yate extends BarcoMotor {
    
    private int camarotes;

    public Yate(int camarotes, int potencia, String matricula, int slora, int anio) {
        super(potencia, matricula, slora, anio);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "camarotes=" + camarotes + '}';
    }

    @Override
    public int modulo() {
        return super.modulo() + this.camarotes; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
