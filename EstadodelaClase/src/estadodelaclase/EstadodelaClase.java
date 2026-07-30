/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadodelaclase;

/**
 *
 * @author victor
 */
import java.util.Scanner;
        
public class EstadodelaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contenido;
        char agua;
        Scanner entrada = new Scanner(System.in);
        System.out.println("El bote es de 500ML");
        System.out.println("Cuantos ML de agua contiene el bote");
        contenido=entrada.nextInt();
        
        if(contenido>=(500/2)) {
            System.out.println("El bote esta arriba de la mitad");
        }
        else {
            System.out.println("EL bote esta abajo de la mitad");
            }
         
        entrada.nextLine();
         System.out.println("El liquido que contiene es Agua? (S/N)");
         agua=entrada.nextLine().charAt(0);
         if (agua=='S'){
             System.out.println("""
                                Si es agua lo que contiene
                                    nada embriagante
                                """);
         }
            else {
                System.out.println("""
                                   Huy que sera?
                                   """);
                                            
                                            }
         }
         
                    } 
            
        
   
