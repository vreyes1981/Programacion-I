/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circulo;

import java.util.Scanner;
/**
 *
 * @author victor
 * 2. Uso de la librería Math Desarrolle un programa que pida al usuario el radio de un círculo.
Utilizando la constante Math.PI y la función Math.pow() de la librería matemática de Java, calcule
el área y circunferencia de dicho círculo y muestre el resultado al usuario.
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        double radio, area, circunferencia;
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Por favor ingrese el radio de un circulo");
        radio=entrada.nextDouble();
        
         /* Los While los agregue para validar que no se permitan valores negativo, se que en clase aun no los hemos visto, pero como
        son muy parecidos a usar IF pr eso los usé
        */
        while(radio<0){
           System.out.println("EL radio de un circulo no puede ser negativo, Por favor ingrese nuevamente el radio de un circulo");
            radio=entrada.nextDouble(); 
                   
        }
        
         area=Math.PI*Math.pow(radio,2);
         circunferencia= 2*Math.PI*radio;
         System.out.printf("El area del circulo es: %.4f\n ", area);
         System.out.printf("La circunferencia del circulo es: %.4f\n ", circunferencia);
     }
    
}
