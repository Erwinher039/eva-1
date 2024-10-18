/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_13_contar;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class EVA_2_13_CONTAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        
     int masvocales = 0;
     int i = 0;
     String letras;
  
     System.out.print("Ingresa una cadena de texto: ");
        letras = captu.nextLine();
        
        while (i < letras.length()) {
            char letra = letras.charAt(i);
            
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                masvocales++;
            }
            
            i++;
        }
        
        System.out.println("Número de vocales: " + masvocales);
    }
    
}
