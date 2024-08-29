/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author Compac
 */
public class Eva_1_5_entrada_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        
        Scanner captu;
        
        captu = new Scanner (System.in);
    
        System.out.println("introduce tu nombre completo: ");
        
        nombre = captu.nextLine();
        
        System.out.println("datos capturados");
        System.out.println(nombre);
    
    }
    
}