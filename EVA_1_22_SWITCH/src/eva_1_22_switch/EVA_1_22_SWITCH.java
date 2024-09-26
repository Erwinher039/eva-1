/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_22_switch;

import java.util.Scanner;

/**
 *
 * @author Compac
 */
public class EVA_1_22_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diaSem;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el numero del dia (1 a 7):");
        diaSem = captu.nextInt();
        captu.nextLine();
        
        switch(diaSem){
        case 1:
            System.out.println("Domingo");
            //break;//Iterrumpe el switch (lo termina)
        case 2:
            System.out.println("Lunes");
            //break;//Iterrumpe el switch (lo termina)
         case 3:
            System.out.println("Martes");
            //break;//Iterrumpe el switch (lo termina)
         case 4:
            System.out.println("Mircoles");
            //break;//Iterrumpe el switch (lo termina)
        case 5:
            System.out.println("Jueves");
            //break;//Iterrumpe el switch (lo termina)
        case 6:
            System.out.println("Viernes");
            //break;//Iterrumpe el switch (lo termina)
        case 7:
            System.out.println("Sabado");
            //break;//Iterrumpe el switch (lo termina)
        default://opcinal, se ejecuta cuando no existe una opcion
            //no tiene break, Y ES LA ULTIMA ISTRUCCION DEL SWITCH
            System.out.println("Numero no es valido (solo del 1 al 7)");
        }    
    }
    
}
