/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_15_arreglos;

/**
 *
 * @author herna
 */
public class EVA_2_15_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // TODO code application logic here
        int[] arreglo = new int [10];//ocupa 40 bytes
        //DECLARACION DE AREGLO
        //manejo por indices
        //primer elemento de un arreglo --> CERO
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;
        arreglo[6] = 700;
        arreglo[7] = 800;
        arreglo[8] = 900;
        //ultimo elemnto de una arreglo --> TAMAÑO - 1
        arreglo[9] = 1000;
        
        //EL ACCSO SIEMPRE ES A TRAVES DE LAS POSICIONES
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
    }
    
}
