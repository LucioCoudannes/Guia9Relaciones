package Services;

import Entidades.Cliente;
import Entidades.Poliza;
import Entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PolizaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ClienteService cs = new ClienteService();
    CoutaService cuotas = new CoutaService();
    

    public void CrearPoliza(ArrayList<Cliente> lc, ArrayList<Vehiculo> lv, ArrayList<Poliza> lp) {

        Poliza p = new Poliza();
        String DNI;
        String v;
        String granizo;

        System.out.println("Ingrese el DNI del cliente");
        DNI = leer.next();

        for (Cliente cl : lc) {

            if (cl.getDni().equalsIgnoreCase(DNI)) {

                p.setCliente(cl);
                
            }

        }

        System.out.println("Ingrese el chasis del vehiculo");
        v = leer.next();

        for (Vehiculo vh : lv) {

            if (vh.getChasis().equalsIgnoreCase(v)) {

                p.setVehiculo(vh);

            }

        }
        
        System.out.println("Ingrese numero de poliza ");
        p.setNpoliza(leer.next());
        System.out.println("ingrese fecha de inicio xx/xx/xxxx");
        p.setFechaI(leer.nextInt());
        System.out.println("ingrese fecha fin de poliza xx/xx/xxxx");
        p.setFechaF(leer.nextInt());
        System.out.println("Ingrese cantidad de coutas");
        p.setCantidadC(leer.nextInt());
        System.out.println("Ingrese forma de pago");
        p.setFormadepago(leer.next());
        System.out.println("Ingrese monto total asegurado");
        p.setMTA(leer.nextDouble());
        System.out.println("Cubre granizo S/N");
        granizo=leer.next();
        if(granizo.equalsIgnoreCase("s")){
            p.setGranizo(true);
            System.out.println("Ingrese monto asegurado por granizo");
            p.setMontogranizo(leer.nextInt());
        }
        System.out.println("Ingrese el tipo de cobertura");
        p.setTipodecobertura(leer.next());
        
        for (int i = 0; i < p.getCantidadC(); i++) {
            
            cuotas.crearCuota(i+1);
            
        }
    }
}
