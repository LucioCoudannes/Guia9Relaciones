
package Services;

import Entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;


public class VehiculoService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearVehiculo (ArrayList<Vehiculo> lv){
        
        Vehiculo v = new Vehiculo();
        
        System.out.println("Ingrese la marca");
        v.setMarca(leer.next());
        System.out.println("Ingrese el modelo");
        v.setModelo(leer.next());
        System.out.println("Ingrese el año");
        v.setAño(leer.nextInt());
        System.out.println("Ingrese numero de motor ");
        v.setNmotor(leer.next());
        System.out.println("ingrese numero de chasis");
        v.setChasis(leer.next());
        System.out.println("Ingrese color");
        v.setColor(leer.next());
        System.out.println("Ingrese el tipo de vehiculo");
        v.setTipo(leer.next());
        
        lv.add(v);
        
    }
    
    
}
