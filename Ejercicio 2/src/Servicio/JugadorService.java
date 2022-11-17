
package Servicio;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class JugadorService {
    
    Scanner leer = new Scanner(System.in);
    RevolverService rs = new RevolverService();
    
    
    public ArrayList<Jugador> crearJugadores(){
       ArrayList<Jugador> listaJugadores = new ArrayList();
       
       
        int cantidad;
        System.out.println("Ingrese la cantidad de jugadores de 1 a 6");
        cantidad=leer.nextInt();
        
        if(cantidad<1||cantidad>6){
            cantidad=6;
        }   
            
         for (int i = 0; i < cantidad; i++) {
           Jugador j = new Jugador();
           j.setID(i+1);
           j.setNombre("Jugador " + (i+1));
           listaJugadores.add(j);
     }
        
       return listaJugadores; 
        
    }
    
    public boolean disparo(Revolver r, ArrayList<Jugador> LJ){
       
       boolean aux = false;
        
        for (int i = 0; i < LJ.size(); i++) {
            
            if(rs.mojar(r)){
                
                LJ.get(i).setMojado(true);
                aux= true;
                
            }else{
                rs.siguienteChorro(r);
            }
               
            
            
        }
        
        
       return aux;

        
    }
    
    
}
