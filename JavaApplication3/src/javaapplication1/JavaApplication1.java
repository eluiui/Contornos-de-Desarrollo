/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


/**
 *
 * @author vanesa
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char C = 'K';
        char[] V = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};
        OperacionsArrays x = new OperacionsArrays();
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(C, V);
        System.out.print(result + "\t");
    }
}
