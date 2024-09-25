/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_19_operador_or;

import java.util.Scanner;

/**
 *
 * @author Compac
 */
public class EVA_1_19_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int km, meses;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el kilometraje:");
        km = captu.nextInt();
        captu.nextLine();
        System.out.println("Captura los meses:");
        meses = captu.nextInt();
        captu.nextLine();
        if(km >= 5000 || meses >= 6){
            System.out.println("Cambio de aceite!!");
            }else{
            System.err.println("Todo bien con el vehiculo");
            }
    }
    
}
