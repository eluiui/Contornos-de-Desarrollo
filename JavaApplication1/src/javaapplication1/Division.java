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
public class Division {
    public float calcularDivision(float dividendo, float divisor) throws Exception {
        if (divisor == 0) {
            throw (new Exception("Error. El divisor no puede ser 0."));
        }
        float resultado = dividendo / divisor;
        return resultado;
    }
}
