/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_16_ciclos_arreglos;

/**
 *
 * @author herna
 */
public class EVA_2_16_CICLOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos, x, y, z; //TDOS SON ARREGLOS
        int val1, val2, arreglo[], val3;//SOLOS arreglo es ARREGLO
        
        arreglo = new int[10];
        
        //LLENAMOS EL ARREGLO CON NUMEROS ENTERO 0 Y 100
        for (int i = 0; i < 10; i++) {
            arreglo[1] = (int)(Math.random() * 100);
        }
        //IMPRIMIMOS LOS NUMEROS
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
}
