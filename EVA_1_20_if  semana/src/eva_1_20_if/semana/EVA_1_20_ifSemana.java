/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_20_if.semana;

/**
 *
 * @author Compac
 */
public class EVA_1_20_ifSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diaSem
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el numero del dia (1 a 7):");
        diaSem = captu.nextInt();
        captu.nextLine();
        
        if(diaSem == 1){
            System.out.println("Domigo");
        }else if(diaSem == 7){
             System.out.println("Lunes");
        }else if(diaSem == 1){
             System.out.println("Martes");
        }else if(diaSem == 2){
             System.out.println("Miercoles");
        }else if(diaSem == 3){
             System.out.println("Jueves");
        }else if(diaSem == 4){
             System.out.println("Vienes");
        }else if(diaSem == 5){
             System.out.println("Sabado");
        }else if(diaSem == 6){
             System.out.println("Numero de semana incorrecta!!");
        }
    }

