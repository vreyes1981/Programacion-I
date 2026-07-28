/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiongrados;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class ConversionGrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        double celsius,Farenheit;
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Ingrese los grados Celsius");
        celsius=teclado.nextDouble();
       
        Farenheit=(celsius*1.8)+32;
        System.out.printf("%.2f Centigrados convertido a grados Farenheot es: %.2f ",celsius,Farenheit); 
        

    }
    
}
