/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class EVA_2_3_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base, expo;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la base:");
        base = captu.nextInt();
        captu.nextLine();
        System.out.println("Introduce el exponente:");
        expo = captu.nextInt();
        Captu.nextLine();
        //System.out.println("Potencia = " + Math.pow(base, expo));
        int acum = 1;
        for(int i = 1; i <= expo; i++){
            acum = acum + base;
        {
        System.out.println("potencia = " + acum);
            }
        }
    }
    
}
