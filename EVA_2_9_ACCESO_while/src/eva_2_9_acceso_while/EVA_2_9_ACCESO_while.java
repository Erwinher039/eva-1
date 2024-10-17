/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_9_acceso_while;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class EVA_2_9_ACCESO_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner captu = new Scanner(System.in);
        //usuario y contraseña
        String cont="", usua="";
        
       
        while(!(usua.equals("admi")&& cont.equals("3312"))){
     System.out.println("usuario:");
        usua=captu.nextLine();
        System.out.println("contraseña:");
        cont=captu.nextLine();    
            
        }
        //! esto es un operador de negacion
//pantralla principal
        System.out.println("hola, esto es el programa principal");
    }
    
}
