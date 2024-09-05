/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vanesa
 */
public class JavaApplication1Test {

    public JavaApplication1Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    @Test
    public void testFactorial1() throws Exception {
        System.out.println("calcularFactorial");
        byte n = 0;
        Factorial instance = new Factorial();
        float expResult = 1;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testFactorial2() throws Exception {
        System.out.println("calcularFactorial");
        byte n = 1;
        Factorial instance = new Factorial();
        float expResult = 1;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testFactorial3() throws Exception {
        System.out.println("calcularFactorial");
        byte n = 2;
        Factorial instance = new Factorial();
        float expResult = 2;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testFactorial4() throws Exception {
        System.out.println("calcularFactorial");
        byte n = 3;
        Factorial instance = new Factorial();
        float expResult = 3;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testFactorial5() throws Exception {
        System.out.println("calcularFactorial");
        byte n = 4;
        Factorial instance = new Factorial();
        float expResult = 24;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testFactorial6() throws Exception {
        System.out.println("calcularFactorial");
        byte n = 127;
        Factorial instance = new Factorial();
        float expResult =(float) 3.0126600184576595448099770775270596923241649186E+213;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0);
    }
     @Test
    public void testFactorial7() throws Exception {
        System.out.println("calcularFactorial");
        byte n = -1;
        Factorial instance = new Factorial();
        float result = instance.factorial(n);
    }
}
