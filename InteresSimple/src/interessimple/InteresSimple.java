/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interessimple;

import java.util.Scanner;

/**
 *
 * @author victor
 * Interés simple Escriba un programa que calcule el interés simple de un préstamo. El sistema
debe solicitar el capital inicial, la tasa de interés anual (en formato de número entero) y el tiempo
en años. Aplique la fórmula (Capital * Tasa * Tiempo) / 100 y muestre el interés generado.
 */

public class InteresSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double capitalinicial,interes;
        int tasa, tiempo;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor ingrese el Capital inicial de su prestamo");
        capitalinicial=entrada.nextDouble();
        while(capitalinicial<=0){
           System.out.println("Su capital inicial no puede ser menor o igual que cero, Por favor ingrese el Capital inicial de su prestamo");
           capitalinicial=entrada.nextDouble(); 
        }
        System.out.println("Cual es la tasa de interes que tiene su prestamo?");
        tasa=entrada.nextInt();
        while(tasa<0){
           System.out.println("Su tasa de interes no puede ser menor que cero, Por favor ingrese la tasa de interes de su prestamo");
           tasa=entrada.nextInt();            
        }
        System.out.println("Cual es el plazo en años de su prestamo?");
        tiempo=entrada.nextInt();
        while(tiempo<=0){
           System.out.println("El tiempo no puede ser menor que cero, Por favor ingrese el tiempo en años de su prestamo");
           tiempo=entrada.nextInt();            
        }
      interes=(capitalinicial*tasa*tiempo)/100;
        System.out.printf("El monto del Interes a pagar al final del prestamo es de: L. %.2f\n",interes);
    }
    
}
