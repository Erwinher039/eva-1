/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_6_erw;

import java.util.Scanner;

/**
 *
 * @author Compac
 */
public class Eva_1_6_erw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String curp;
        int edad;
        double promedio;
    //ahora crearemos nustro scanner
    Scanner captu;
    captu = new Scanner(System.in);
    //tiempo de captura
    System.out.println("captura tu nombre completo");
    nombre=captu.nextLine();
    
    System.out.println("escribe tu curp");
    curp=captu.nextLine();
    
    System.out.println("captura tu edad:");
    edad=captu.nextInt( );
    System.out.println("tu promedio");
    promedio= captu.nextDouble();

    //impesion de los datos 
    System.out.println("estos son tus datos");
    System.out.println(nombre);
    System.out.println(curp);
    System.out.println(edad);
    System.out.println(promedio);
    }
    
}
