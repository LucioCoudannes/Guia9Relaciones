
package Services;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;


public class ClienteService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public void crearCliente(ArrayList<Cliente> lc){
        
        Cliente cliente = new Cliente();
        
        System.out.println("Ingrese el nombre");
        cliente.setNombre(leer.next());
        System.out.println("ingrese el apellido");
        cliente.setApellido(leer.next());
        System.out.println("ingrese DNI");
        cliente.setDni(leer.next());
        System.out.println("Ingrese mail");
        cliente.setMail(leer.next());
        System.out.println("ingrese domicilio");
        cliente.setDomicilio(leer.next());
        System.out.println("ingrese el telefono");
        cliente.setTelefono(leer.next());
        lc.add(cliente);
    }
    
    
    
}
