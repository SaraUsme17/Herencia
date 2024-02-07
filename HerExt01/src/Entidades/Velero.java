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
public final class Velero extends Barco {
    
    private int numMastiles;


    public Velero(int numMastiles, String matricula, int slora, int anio) {
        super(matricula, slora, anio);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "numMastiles=" + numMastiles + '}';
    }

    @Override
    public int modulo() {
        return super.modulo() + this.numMastiles; //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
}
