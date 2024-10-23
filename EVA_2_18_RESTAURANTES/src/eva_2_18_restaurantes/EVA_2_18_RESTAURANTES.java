/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_18_restaurantes;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class EVA_2_18_RESTAURANTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String menu[] = {"Dogos", "Hamburguesa", "Boneless", "Tacos",
        "Montados", "Camarones"};
        int precios[] = {50, 80, 120, 150, 70, 200};
        Scanner captu = new Scanner(System.in);
        int producto, cantidad;
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " - " + menu[i] + " $" + precios[i]);
        }
         System.out.println("Cual es tu orden? (Intoduce el numero del producto)");
        producto = captu.nextInt();
        captu.nextLine();
        System.out.println("Cuantas ordenes?");
        cantidad = captu.nextInt();
        captu.nextLine();
        System.out.println("El costo es de = $" + cantidad * precios[producto]);
        
    }
    
}
