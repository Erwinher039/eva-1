/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_11_conversiones;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Compac
 */
public class Eva_1_11_Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONVERSIONES DE TEMPERATURA
        double faht, cent;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("captura los ºFahrenheit:");
        faht = captu.nextDouble();
        cent = (faht - 32) / 1.8;//expresion
        System.out.println("ºC = " + cent);
        
        //pide los grados centigrados al usurio
        Scanner capture;
        //pide datos farenheit al usuario y conviertelo a centrigrados
         //
         double farenheit;
         double centrigrados;
         double kelvins;
         capture = new Scanner(System.in);
         System.out.println("introduce los grados Farenheit: ");
         farenheit = capture.nextDouble();
         centrigrados = (farenheit - 32) / 1.8;
        System.out.println("los grados sentigrados son: " + faht);
        //pide datos centrigados al usuario y conviertelo a kelvin
        System.out.println("introduce los grados centigrados: ");
        centrigrados = capture.nextDouble();
        kelvins = centrigrados + 273.15;
        System.out.println("los grados kelvin son: " + kelvins);
        System.out.println("Introducen los grados celcius: ");
        centrigrados = capture.nextDouble();
        farenheit = (centrigrados * 1.8) + 32;
        System.out.println("los grados farenheit son: " + farenheit);
        capture.close();
    }
    
}
