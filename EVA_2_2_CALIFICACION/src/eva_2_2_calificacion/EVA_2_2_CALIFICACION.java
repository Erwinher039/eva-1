/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_2_calificacion;

/**
 *
 * @author herna
 */
public class EVA_2_2_CALIFICACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa, acum;
        Scanner captu = new Scanner(System.in);
        acum = 0;
        for(int i = 1; i <= 20; i++){
            System.out.println("Estudiante #" + i);
            System.out.println("Introducce la calificacion: ");
            califa = captu.nextInt();
            captu.nextLine();
            acum = acum + califa;
        }
        System.out.println("acum = " + (acum / 10.0));
    }
    
}
