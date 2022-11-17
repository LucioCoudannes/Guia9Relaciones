
package guia9eje2;

import Entidades.Jugador;
import Entidades.Revolver;
import Servicio.JugadorService;
import Servicio.RevolverService;
import java.util.ArrayList;

public class Guia9Eje2 {

    public static void main(String[] args) {
       
        RevolverService rs = new RevolverService();
        JugadorService js = new JugadorService();
        
        Revolver r2= rs.llenarRevolver();
     
        while(!rs.mojar(r2)){
            
          rs.siguienteChorro(r2);  
           
        }
        
        ArrayList<Jugador> LJ= js.crearJugadores();
        
        for (Jugador j : LJ) {
            
            System.out.println(j);
            
        }
        
        
        
    }
    
}
