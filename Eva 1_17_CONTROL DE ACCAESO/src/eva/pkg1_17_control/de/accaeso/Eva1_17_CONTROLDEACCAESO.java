/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva.pkg1_17_control.de.accaeso;

import java.util.Scanner;

/**
 *
 * @author Compac
 */
public class Eva1_17_CONTROLDEACCAESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        // TODO code application logic here
        //crear variables y capturar usurario y contraseña
        String pwd;
        Scanner captu = new Scanner(System.ln);
        System.out.println("usuario: ");
        String usu = captu.nextLine();
        System.out.println("password: ");
        pwd = captu.nextLine();
        
        
        if("Admin".equals(usu) && "1234".equals(pwd)){
            System.out.println("Acceso concedido!!!");
        }else{
        System.out.println("Acceso denegado!!");
    }
}
