/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_24_califas;

/**
 *
 * @author Compac
 */
public class EVA_1_24_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
      System.out.println("Cual es la calificación? (0-100)");
        int calífa = captura.nextInt();
        captura.nextLine();
        
        if (calífa>=90 && calífa <=100){
           System.out.println("A");
        }else if (calífa>=80 && calífa <=89){
           System.out.println("B");
        }else if (calífa>=70 && calífa <=79){
           System.out.println("C");
        }else if (calífa>=60 && calífa <=69){
           System.out.println("D");
        }else if (calífa>=0 && calífa <=59){
           System.out.println("F");
        }else{
            System.out.println("Calificación invalida");
        }
    }
    
}
