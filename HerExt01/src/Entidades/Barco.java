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
public class Barco {
    protected String matricula;
    protected int slora;
    protected int anio;

    public Barco() {
    }

    public Barco(String matricula, int slora, int anio) {
        this.matricula = matricula;
        this.slora = slora;
        this.anio = anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getSlora() {
        return slora;
    }

    public void setSlora(int slora) {
        this.slora = slora;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", slora=" + slora + ", anio=" + anio + '}';
    }
    
    public int modulo(){
        
        
        return this.slora*10;
    
    
    }
}
