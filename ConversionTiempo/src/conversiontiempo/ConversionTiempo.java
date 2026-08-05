/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiontiempo;

import java.util.Scanner;

/**
 *
 * @author victor
 * Uso del operador módulo (Conversión de tiempo)
 * Escriba un programa que solicite una cantidad de tiempo expresada en
 * minutos (por ejemplo, 135 minutos). Utilizando el operador de división (/)
 * y el operador de módulo (%), calcule y muestre a cuántas horas y minutos
 * exactos equivale esa cantidad.
 */
public class ConversionTiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int minutosTotales, horas, minutos;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese la cantidad de tiempo en minutos");
        minutosTotales = entrada.nextInt();
        while (minutosTotales <= 0) {
            System.out.println("La cantidad de minutos no puede ser menor o igual que cero, por favor ingrese la cantidad de tiempo en minutos");
            minutosTotales = entrada.nextInt();
        }

        horas = minutosTotales / 60;
        minutos = minutosTotales % 60;

        System.out.printf("%d minutos equivalen a %d horas con %d minutos\n", minutosTotales, horas, minutos);
    }

}