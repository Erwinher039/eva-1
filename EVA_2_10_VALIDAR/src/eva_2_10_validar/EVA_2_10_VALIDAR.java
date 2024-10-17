/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_10_validar;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class EVA_2_10_VALIDAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diaSem;
        Scanner captu = new Scanner(System.in);
        do{
            System.out.println("Captura el numero del dia (1 a 7):");
            diaSem = captu. nextInt();
            captu.nextLine();
        }while(diaSem < 1 || diaSem > 7);
        //while
        int diasem = 0;
    
      if(diasem ==1){
    System.out.println("domingo");
    }
    else if (diasem ==2){
    System.out.println("lunes");
    }
     else if (diasem ==3){
    System.out.println("martes");
    }
     else if (diasem ==4){
    System.out.println("miercoles");
    }
     else if (diasem ==5){
    System.out.println("jueves");
    }
     else if (diasem ==6){
    System.out.println("viernes");
    }
     else if (diasem ==7){
    System.out.println("sabado");
    }
     else{
    System.out.println("invalido");
    }
    }
    
}
