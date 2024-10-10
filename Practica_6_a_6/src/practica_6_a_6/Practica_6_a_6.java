/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_6_a_6;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class Practica_6_a_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        String cade = "";
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        num = captu.nextInt();
        captu.nextLine();
        for(int i = 1; i <= num; i++){
            cade = cade + "*";
            System.out.println(cade);
        }
        //ANIDACION
        //FOR ANIDADO
        for(int i = 5; i >= 1; i--){
            cade = "";
            for(int j = 1; j <= i; j++){
                cade = cade + "*";
            }
            System.out.println(cade);
        }
    }
    
}
