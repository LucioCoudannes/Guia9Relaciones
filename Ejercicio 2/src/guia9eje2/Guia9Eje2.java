
package guia9eje2;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import Servicio.JuegoService;
import Servicio.JugadorService;
import Servicio.RevolverService;
import java.util.ArrayList;

public class Guia9Eje2 {

    public static void main(String[] args) {
       
        RevolverService rs = new RevolverService();
        JugadorService js = new JugadorService();
        JuegoService j1 = new JuegoService();
        Juego juego1 = j1.llenarJuego(js.crearJugadores(), rs.llenarRevolver());
        
        j1.ronda(juego1);
        
        
    }
    
}
