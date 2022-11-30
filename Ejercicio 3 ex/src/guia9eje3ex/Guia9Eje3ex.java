
package guia9eje3ex;

import Entidades.Cliente;
import Entidades.Poliza;
import Entidades.Vehiculo;
import Services.ClienteService;
import Services.PolizaService;
import Services.VehiculoService;
import java.util.ArrayList;


public class Guia9Eje3ex {

 
    public static void main(String[] args) {
        
        ClienteService cs = new ClienteService();
        VehiculoService vs = new VehiculoService();
        PolizaService ps = new PolizaService();
       
        ArrayList<Cliente> listaclientes = new ArrayList();
        ArrayList<Vehiculo> listaVehiculo = new ArrayList();
        ArrayList<Poliza> listaPolizas = new ArrayList();
        
        cs.crearCliente(listaclientes);
        vs.crearVehiculo(listaVehiculo);
        ps.CrearPoliza(listaclientes, listaVehiculo, listaPolizas);
        
        
        
        
        
        
        
        
    }
    
}
