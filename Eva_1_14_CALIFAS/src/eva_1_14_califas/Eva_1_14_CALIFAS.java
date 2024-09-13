/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_14_califas;

import java.util.Scanner;

/**
 *
 * @author Compac
 */
public class Eva_1_14_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner captu = new Scanner (System.in);
        System.out.println("¿cual es la calificacion?");
        califa = captu.nextInt();
        if(califa < 70){//SE PUEDE PONER if(califa >=70)
            System.out.println("NA");
        }else{
    System.out.println("ACREDITAS");
    }

}
}