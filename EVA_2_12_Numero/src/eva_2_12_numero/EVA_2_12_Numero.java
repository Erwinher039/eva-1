/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_12_numero;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class EVA_2_12_Numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, masgrande=-9999999;
        Scanner captu = new Scanner(System.in);
        
        do{
        System.out.println("un numero entero:");
        num= captu.nextInt();
        captu.nextLine();
        
        if(num>masgrande);
        masgrande=num;
        }while(!(num==-1));
          System.out.println(masgrande);
    }
    
}
