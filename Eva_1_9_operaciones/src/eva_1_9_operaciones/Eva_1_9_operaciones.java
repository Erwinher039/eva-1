/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_9_operaciones;

/**
 *
 * @author Compac
 */
public class Eva_1_9_operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // TODO code application logic here
        //OPERACIONES ARTIMETRICAS
        //inicializacion de una variable
        //declaraciones y asignaciones
        //declaraciones y asignaciones
        int x = 10;//declaracion y asignacion
        int y =  5;
        //si necesitan muchas variables:
        int suma, resta, mult, div, pot, raiz;
        //suma y resta
        suma = + y;//operaciones de suma +
        System.out.println("la suma de x + y :");
        System.out.println(suma);
        
        resta = x - y;
        System.out.println("Resta de x - y: ");
        System. out. println(resta);
        
        //MULTIPLICACION
        mult = x * y; //operador de multiplicacion '
        System.out.println("la multiplicacion de x * y:");
        System.out.println(mult);
        
        //DIVISION
        //En java, las operaciones dependen del tipo de la division
        //divides entero, java da como resultado entero
        div = x / y; //operacion de division /
        System.out.println("El resultado de la division x ");
        System.out.println(div);
        x = 5;
        y = 2;
        div = x / y;
        System.out.println("Division de x (5) / y (2):");
        System.out.println(div);
        
        //division con numeros con punto flotante
        double val1 = 5;
        double val2 = 2;
        double resu;
        resu = val1 / val2;
        System.out.println("Division de val1 (5) / val2 (2)");
        System.out.println(resu);
        
    }
    
}
