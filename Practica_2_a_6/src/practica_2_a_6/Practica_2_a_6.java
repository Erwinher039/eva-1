/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_2_a_6;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class Practica_2_a_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitar dos números
        try ( // TODO code application logic here
                Scanner sc = new Scanner(System.in)) {
            // Solicitar dos números
            System.out.print("Ingresa el primer número: ");
            int num1 = sc.nextInt();
            System.out.print("Ingresa el segundo número: ");
            int num2 = sc.nextInt();
            
            // Imprimir en orden ascendente
            System.out.println("Números en orden ascendente:");
            if (num1 <= num2) {
                for (int i = num1; i <= num2; i++) {
                    System.out.println(i);
                }
            } else {
                for (int i = num2; i <= num1; i++) {
                    System.out.println(i);
                }
            }
            
            // Imprimir en orden descendente
            System.out.println("Números en orden descendente:");
            if (num1 >= num2) {
                for (int i = num1; i >= num2; i--) {
                    System.out.println(i);
                }
            } else {
                for (int i = num2; i >= num1; i--) {
                    System.out.println(i);
                }
            }
        }
    }
    
}
