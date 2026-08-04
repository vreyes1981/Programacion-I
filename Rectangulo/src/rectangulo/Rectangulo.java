/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangulo;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double base, altura, area;
        
        Scanner entrada = new Scanner(System.in);
        
        // TODO code application logic here
        
        System.out.println("Ingrese la base del rectangulo\n");
        base=entrada.nextDouble();
        /* Los While los agregue para validar que no se permitan valores negativo, se que en clase aun no los hemos visto, pero como
        son muy parecidos a usar IF pr eso los usé
        */
        while (base<0){
            System.out.println("la base de un rectangulo no puede ser menor que cero(0) \n");
            System.out.println("por favor Ingrese nuevamente la base del rectangulo\n");
           base=entrada.nextDouble();
        }
        System.out.println("Ingrese la altura del rectangulo\n");
        altura=entrada.nextDouble();
        
         while (altura<0){
            System.out.println("la altura de un rectangulo no puede ser menor que cero(0) \n");
            System.out.println("por favor Ingrese nuevamente la altura del rectangulo\n");
            altura=entrada.nextDouble();
        }
        area=base*altura;
        
        System.out.println("El area del rectangulo es: " +area);
        
    }
    
}
