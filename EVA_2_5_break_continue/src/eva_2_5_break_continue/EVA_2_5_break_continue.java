/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_5_break_continue;

/**
 *
 * @author herna
 */
public class EVA_2_5_break_continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 10; i++) {
            //CONTINUE -->SE SALTA LA ITERACION ACTUAL
            /*if(i == 8)
            continue;*///interrumple la repeticion desde este punto
            if(i == 8)
                break; //detiene el ciclo por completo en esta punto
            System.out.print(i + " - ");
        }
    }
    
}