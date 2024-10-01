/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_25_bisiesto;

/**
 *
 * @author Compac
 */
public class EVA_1_25_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el año:");
        
        int year = Scanner.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println ("El año " + year + " es bisiesto");
        }else{
            System.out.println("El año " + year + " no es bisiesto");
        }
    }
    
}
