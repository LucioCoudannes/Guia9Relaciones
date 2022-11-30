/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia9eje3;

import Entidades.Carta;
import Service.CartaService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class Guia9Eje3 {

    public static void main(String[] args) {
        
        CartaService cs = new CartaService();
        ArrayList<Carta> baraja = new ArrayList();
        ArrayList<Carta> monton = new ArrayList();
      
        Scanner leer = new Scanner(System.in);
        
        
        cs.crearBaraja(baraja);
        cs.menu(baraja, monton);
        
        
        
        
       
    }
}
