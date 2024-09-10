/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_12_formulas;

import java.util.Scanner;

/**
 *
 * @author Compac
 */
public class Eva_1_12_formulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double acel, tiem, vel, dist;
        
        Scanner captu = new Scanner (System.in);
        
        System.out.println("el valor de la aceleracion  es:");
        acel=captu.nextDouble();
        System.out.println("el valor del tiempo es:");
        tiem=captu.nextDouble();
        System.out.println("el valor de la velocidad es:");
        vel=captu.nextDouble();
        dist=vel * tiem + (acel*tiem*tiem)/2.0;
        System.out.println("la distnaica es: "+ dist);
    }
    
}
