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
public class OperacionsArrays {

    public boolean busca(char c, char[] v) {
        int a, z, m;
        a = 0;
        z = v.length - 1;
        boolean resultado = false;
        while (a <= z && resultado == false) {
            m = (a + z) / 2;
            if (v[m] == c) {
                resultado = true;
            } else {
                if (v[m] < c) {
                    a = m + 1;
                } else {
                    z = m - 1;
                }
            }
        }
        return resultado;
    }
}
