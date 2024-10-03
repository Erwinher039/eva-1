/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class EVA_2_4_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor, facto;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el valor:");
        valor = captu.nextInt();
        captu.nextLine();
        
        facto = 1;
        //far(int i = 1; i <= valor; i++)
        for(int i = valor ; i >= 1; i--){
            facto = facto * i;
        }
        System.out.println("El factorial de " + valor + " - " + facto);
    }
    
}
