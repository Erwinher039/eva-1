/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_4_a_6;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class Practica_4_a_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        // Solicitar una cadena
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = sc.nextLine();
        
        // Imprimir solo las vocales
        System.out.println("Vocales en la cadena:");
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.toLowerCase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println(c);
            }
        }
        
        sc.close();
    }
    
}
