/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author A288808
 */
public class Revolver {
    
    
    private Integer posicionA;
    private Integer posicionAgua;

    public Revolver() {
    }

    public Revolver(Integer posicionA, Integer posicionAgua) {
        this.posicionA = posicionA;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionA() {
        return posicionA;
    }

    public void setPosicionA(Integer posicionA) {
        this.posicionA = posicionA;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionA=" + posicionA + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
    
    
    
    
    
    
}
