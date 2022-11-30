
package Services;

import Entidades.Cuota;
import java.util.Scanner;


public class CoutaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cuota crearCuota(int nc){
      
        Cuota c = new Cuota();
        
        
        System.out.println("Ingrese el valor de la cuota");
        c.setVcouta(leer.nextInt());
        System.out.println("Ingrese fecha de Vencimiento");
        c.setFechadevenc(leer.next());
        System.out.println("Ingrese forma de pago");
        c.setFormadepago(leer.next());
        System.out.println("Ingrese el numero de cuota");
        c.setNcouta(nc);
             
        
        return c;
    }
    
    
    
    
}
