/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_5_a_6;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class Practica_5_a_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        
        // Solicitar un número
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();
        
        // Imprimir el patrón
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
    
}
