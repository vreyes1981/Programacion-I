/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiontemperatura;

import java.util.Scanner;

/**
 *
 * @author victor
 * Operación matemática mixta
 * Escribir un programa para convertir temperaturas. El programa debe solicitar
 * al usuario que ingrese una temperatura en grados Fahrenheit. Luego, aplique
 * la fórmula matemática mixta (Fahrenheit - 32) * 5 / 9 para convertir el
 * valor a grados Celsius y muestre el resultado final.
 */
public class ConversionTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double fahrenheit, celsius;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese la temperatura en grados Fahrenheit");
        fahrenheit = entrada.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("La temperatura de %.2f°F equivale a %.2f°C\n", fahrenheit, celsius);
    }

}