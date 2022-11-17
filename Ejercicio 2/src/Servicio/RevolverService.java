
package Servicio;

import Entidades.Revolver;
import java.util.Objects;
import java.util.Scanner;

public class RevolverService {
    
    Scanner leer = new Scanner(System.in);
   
    
    public Revolver llenarRevolver(){
         Revolver r1 = new Revolver();
        
        System.out.println("Cargamos la bala");
        r1.setPosicionAgua((int)(Math.random()*5+1));
        System.out.println("Posicion de la bala "+ r1.getPosicionAgua());
        System.out.println("Girar el Tambor");
        r1.setPosicionA((int)(Math.random()*5+1));
        System.out.println("posicion de inicio del tambor "+ r1.getPosicionA());
        
        return r1;
                
    }
    
    public boolean mojar(Revolver r1){
        
        boolean corchazo = false;
        
        if(Objects.equals(r1.getPosicionA(), r1.getPosicionAgua())){
            
            corchazo=true;
            System.out.println("no la contas");
        }else{
            
            System.out.println("safaste");
        }
        
        return corchazo;
    }
    
    public void siguienteChorro(Revolver r1){
        
        if(r1.getPosicionA()<5){
            
            r1.setPosicionA(r1.getPosicionA()+1);   
             System.out.println("posicion " + r1.getPosicionA());        
        }else{
             
            r1.setPosicionA(0);
            System.out.println("posicion " + r1.getPosicionA());
        }
        
        
    }
    
    
    
    
    
}
