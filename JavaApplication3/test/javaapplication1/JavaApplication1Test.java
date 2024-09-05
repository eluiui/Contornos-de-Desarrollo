/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

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
    public void testBusca1() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = {'K'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }

    @Test
    public void testBusca2() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = {'J'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = false;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }

    @Test
    public void testBusca3() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = {'K', 'L'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }

    @Test
    public void testBusca4() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = {'J', 'K'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }

    @Test
    public void testBusca5() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = {'J', 'J'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = false;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }

    @Test
    public void testBusca6() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = {'A', 'A', 'A', 'A', 'K', 'L', 'L', 'L', 'L'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }

    @Test
    public void testBusca7() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = {'A', 'A', 'A', 'K', 'L', 'L', 'L', 'L', 'L'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }

    @Test
    public void testBusca8() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = {'A', 'A', 'A', 'A', 'A', 'K', 'L', 'L', 'L'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }

    @Test
    public void testBusca9() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = false;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }

    @Test
    public void testBusca10() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = {'A', 'A', 'A', 'A', 'K', 'L', 'L', 'L', 'L', 'L'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }

    @Test
    public void testBusca11() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = {'A', 'A', 'A', 'K', 'L', 'L', 'L', 'L', 'L'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }

    @Test
    public void testBusca12() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = {'A', 'A', 'A', 'A', 'A', 'K', 'L', 'L', 'L', 'L'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }

    @Test
    public void testBusca13() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = false;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }

    @Test(expected = Exception.class)
    public void testBusca14() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = null;
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
    }

    @Test(expected = Exception.class)
    public void testBusca15() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
    }
    @Test(expected = Exception.class)
    public void testBusca16() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = {'A', 'P', 'S', 'K'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
    }
    @Test(expected = Exception.class)
    public void testBusca17() throws Exception {
        System.out.println("Busca");
        char c = 'K';
        char[] v = {'A', 'A', 'A', 'A', 'K', 'A', 'A', 'A', 'A', 'A'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
    }

}
