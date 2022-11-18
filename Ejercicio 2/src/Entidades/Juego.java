/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author A288808
 */
public class Juego {
    
    private ArrayList<Jugador> jugadoresJ;
    private Revolver revolverJ;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadoresJ = jugadores;
        this.revolverJ = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadoresJ;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadoresJ = jugadores;
    }

    public Revolver getRevolver() {
        return revolverJ;
    }

    public void setRevolver(Revolver revolver) {
        this.revolverJ = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadoresJ + ", revolver=" + revolverJ + '}';
    }
    
    
    
    
    
}
