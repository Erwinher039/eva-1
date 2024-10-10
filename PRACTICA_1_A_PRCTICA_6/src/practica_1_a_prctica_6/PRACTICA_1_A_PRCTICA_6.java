/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_1_a_prctica_6;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class PRACTICA_1_A_PRCTICA_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        
        // Solicitar una cadena de texto
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = sc.nextLine();
        
        // Solicitar un número
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();
        
        // Imprimir la cadena el número de veces solicitado
        for (int i = 0; i < numero; i++) {
            System.out.println(cadena);
        }
        
        sc.close();
        
    }
    
}
