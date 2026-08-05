/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuentoarticulo;

import java.util.Scanner;

/**
 *
 * @author victor
   Aplicación de porcentaje de descuento
   Desarrolle un programa que solicite el precio original de un artículo y el
   porcentaje de descuento que se le aplicará (por ejemplo, 15). Calcule el
   monto en dinero que representa ese descuento y réstelo al precio original
   para mostrarle al usuario el precio final a pagar.
 */
public class DescuentoArticulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double precioOriginal, montoDescuento, precioFinal;
        int porcentajeDescuento;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese el precio original del articulo");
        precioOriginal = entrada.nextDouble();
        while (precioOriginal <= 0) {
            System.out.println("El precio no puede ser menor o igual que cero, por favor ingrese el precio original del articulo");
            precioOriginal = entrada.nextDouble();
        }

        System.out.println("Cual es el descuento a aplicar? (ejemplo: 15)");
        porcentajeDescuento = entrada.nextInt();
        while (porcentajeDescuento <= 0 || porcentajeDescuento > 100) {
            System.out.println("El porcentaje de descuento debe estar entre 1 y 100, por favor ingrese el porcentaje nuevamente");
            porcentajeDescuento = entrada.nextInt();
        }

        montoDescuento = (precioOriginal * porcentajeDescuento) / 100;
        precioFinal = precioOriginal - montoDescuento;

        System.out.printf("El descuento aplicado es de: L. %.2f\n", montoDescuento);
        System.out.printf("El precio final a pagar es de: L. %.2f\n", precioFinal);
    }

}