/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;

/**
 *
 * @author A288808
 */
public class JuegoService {
    
    JugadorService js = new JugadorService();
    RevolverService rs = new RevolverService();
    Juego j = new Juego();
    
    public Juego llenarJuego (ArrayList<Jugador>jugadores, Revolver r){
        
        j.setJugadores(jugadores);
        j.setRevolver(r);
        
        return j;
    }
    
    public void ronda (Juego j){
    
        boolean aux=false;
        
        do {
           for (Jugador j1 : j.getJugadores()) {
               
               System.out.println("Le toca al " + j1.getNombre() + " disparar");
           if(js.disparo(j.getRevolver())){
               
               j1.setMojado(true);
               System.out.println("el " + j1.getNombre() + " la quedo por que se pego el corchazo");
               aux=true;
               break;
             }else {
               System.out.println("El " + j1.getNombre() + " safo");
               System.out.println("El tambor gira a la posicion "+ j.getRevolver().getPosicionA());
              
           }
           
        }
            
        } while (!aux);
        
}
    
    
    
}
