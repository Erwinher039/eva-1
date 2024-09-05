/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_capturar_auto;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA1_7_capturar_auto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Vehiculo:
        String marca;
        String modelo;
        int año; 
        double precio;
        //creacion de scanner
        Scanner captu;
        captu = new Scanner(System.in);
        //capturar
        System.out.println("capturar tu marca de auto");
        marca = captu.nextLine();
        System.out.println("capturar tu modelo de auto");
        modelo = captu.nextLine();
        System.out.println("captura el año del carro");
        año = captu.nextInt();
        System.out.println("captura el precio del auto");
        precio = captu.nextDouble();
        //impresion
        System.out.println("<<<<<<<<<<<DATOS IMPRIMIDOS>>>>>>>>>>>>");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(año);
        System.out.println(precio);
    }
    
}
