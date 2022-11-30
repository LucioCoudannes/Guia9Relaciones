package Service;

import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class CartaService {

    Scanner leer = new Scanner(System.in);

    public void crearBaraja(ArrayList<Carta> baraja) {

        String palo = "";

        for (int j = 0; j < 4; j++) {

            switch (j) {

                case 0:
                    palo = "espada";
                    break;
                case 1:
                    palo = "oro";
                    break;
                case 2:
                    palo = "basto";
                    break;
                case 3:
                    palo = "copa";
                    break;

            }

            for (int i = 1; i < 13; i++) {

                if (i != 8 && i != 9) {

                    baraja.add(new Carta(i, palo));

                }

            }

        }

    }

    public void barajar(ArrayList<Carta> baraja) {

        Collections.shuffle(baraja);
        for (Carta carta : baraja) {
            System.out.println(carta.toString());
        }

    }

    public Carta siguienteCarta(ArrayList<Carta> baraja, ArrayList<Carta> monton) {
        
        Iterator<Carta> it = baraja.iterator();
        Carta c = new Carta();
        c = it.next();
        monton.add(new Carta(c.getNumero(), c.getPalo()));
        it.remove();

        return c;

    }

    public int cartasDisponibles(ArrayList<Carta> baraja) {

        int aux = baraja.size();
        System.out.println("Quedan " + baraja.size() + " cartas");

        return aux;

    }

    public ArrayList<Carta> darCartas(ArrayList<Carta> baraja, ArrayList<Carta> monton) {

        ArrayList<Carta> mano = new ArrayList();

        int num = 0;

        System.out.println("¿Cuantas cartas quiere?");
        num = leer.nextInt();
        
        if(baraja.size()>num){
            
             for (int i = 0; i < num; i++) {
         mano.add(siguienteCarta(baraja, monton));
        }
        }else{
            System.out.println("no hay cartas suficientes");
            
        }
        
       

        return mano;

    }

    public void mostrarBaraja(ArrayList<Carta> mostrarBaraja) {

        if (!mostrarBaraja.isEmpty()) {

            for (Carta carta : mostrarBaraja) {
                System.out.println(carta.toString());
            }
        } else {
            System.out.println("Aun no hay cartas en el monton");
        }
    }

    public void menu(ArrayList<Carta> baraja, ArrayList<Carta> monton){
       int OP = 0;
       ArrayList<Carta> mano = new ArrayList(); 
      do {
        System.out.println("MENU");
        System.out.println("1 - Mesclar las cartas");
        System.out.println("2 - Dar Cartas");
        System.out.println("3 - Mostrar Baraja");
        System.out.println("4 - Mostrar Monton");
        System.out.println("5 - Cartas Disponibles");
        System.out.println("6 - SALIR");
        OP=leer.nextInt();
            switch (OP){
            
            case 1: barajar(baraja);
            break;
            case 2: mano=darCartas(baraja, monton);
                    mostrarBaraja(mano);
            break;
            case 3: mostrarBaraja(baraja);
            break;
            case 4: mostrarBaraja(monton);
            break;
            case 5: cartasDisponibles(baraja);
            break;
            
        }
            
        } while (OP!=6);
        
        System.out.println("Salio del juego");  
        
        
    }
}
