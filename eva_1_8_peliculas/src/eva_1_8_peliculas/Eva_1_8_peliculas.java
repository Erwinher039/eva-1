/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_8_peliculas;

/**
 *
 * @author Compac
 */
public class Eva_1_8_peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
      String nombre;
      String genero;
      String duracion;
      String reparto;
      String clasificacion;
      
      Scanner captu;
      captu = new Scanner(System.in);
      
      System.out.println("Captura el nombre de la pelicula");
      nombre = captu.nextline();
      System.out.println("Captura del genero de la pelicula");
      genero = captu.nextline();
      System.out.println("Captura la duracion en segundos");
      duracion = captu.nextint();
      captu.nextline();
      
      
      System.out.println("Capturar el reparto ");
      reparto = captu.nextLine();
      System.out.println("Captura la clasificacion ");
      clasi = captu.nextLine();
      
      System.out.println("IMPRESION DE LA CAPTURA ------ ");
      System.out.println(nombre);
      System.out.println(genero);
      System.out.println(duracion);
      System.out.println(reparto);
      System.out.println(clasi);
    }
    
}
