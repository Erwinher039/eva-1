/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_19_menu;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class EVA_2_19_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String menu[];
        int precios[];
        Scanner captu = new Scanner(System.in);
        int cant;
        System.out.println("cuantos productos tendra el menu:");
        cant = captu.nextInt();
        menu = new String[cant];//tamaño de los arreglos (cant)
        precios = new int[cant];
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Nombre del producto: ");
            menu[1] = captu.nextLine();
            System.out.println("Precio:");
            precios[1] = captu.nextInt();
            captu.nextLine();
        }
        for (int i = 0; i < menu.length; i++ ) {
            System.out.println(i + " - " + menu[1] + " $" + precios[i]);
        }
    }
    
}
