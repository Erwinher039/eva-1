/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_7_while;

/**
 *
 * @author herna
 */
public class EVA_2_7_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //FOR ---> Sabemos la cantidad de repitciciones
        //WHILE --> CERO o MAS repeticiones
        //DO WHILE --> UNA o MAS repeticiones
        //WHILE
        System.out.println("WHILE");
        int val=1;
        while(val <=10){//MIENTRAS(ESTO SEA VERDAD)(REPITEN ESTAS INSTRUCCIONES
            System.out.print(val + " - ");
            val++;
    }
        //DO WHILE
        System.out.println("");
        System.out.println("DO WHILE");
        val = 1;
        do{
        System.out.println(val + " - ");
        val++;
        }while(val <=10);//repite las instrucciones cuando el parentencis es verdad 
    }
    
}
