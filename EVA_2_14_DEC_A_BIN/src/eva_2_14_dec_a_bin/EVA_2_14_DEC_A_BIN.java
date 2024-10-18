/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_14_dec_a_bin;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class EVA_2_14_DEC_A_BIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner captu = new Scanner(System.in);
         
         int numero, residuo;
          String binario = ""; 
         
        
        System.out.print("Ingresa un número entero: ");
        numero = captu.nextInt();
        
        // Verificar si el número es 0
        if (numero == 0) {
            System.out.println("El número en binario es: 0");
        } else {
          
            while (numero > 0) {
                residuo = numero % 2; 
                binario = residuo + binario; 
                numero = numero / 2; 
            }
            
            System.out.println("El número en binario es: " + binario);
        }
    }
    
}
