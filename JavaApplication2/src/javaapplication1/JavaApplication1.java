/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author vanesa
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("\nCÁLCULO DEL FACTORIAL\n");
        Scanner teclado = new Scanner(System.in);
        boolean error;
        byte n;
        do {
            try {
                error = false;
                System.out.printf("Teclee n (>= 0 y <=%d):  ", Byte.MAX_VALUE);
                n = teclado.nextByte();
                Factorial es = new Factorial();
                System.out.printf("Factorial(%d) = %f\n", n, es.factorial(n));

            } catch (NumberFormatException e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println("Error en la conversión");
                error = true;
            } catch (InputMismatchException e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println("Error. El dato tecleado no es válido");
                error = true;
            } catch (Exception e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println(e.getMessage()); // Muestra el error
                error = true;
            }
        } while (error);
    }
}
