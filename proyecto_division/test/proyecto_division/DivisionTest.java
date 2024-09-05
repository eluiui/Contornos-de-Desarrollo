/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyecto_division;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.Constants.ERROR;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a22jesusbm
 */
public class DivisionTest {

    public DivisionTest() {
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

    /**
     * Test of calcularDivision method, of class Division.
     */
    @Test
    public void testCalcularDivision() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 0.0F;
        float divisor = 0.0F;
        Division instance = new Division();
        float expResult = 0.0F;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcularDivision2() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 1.40130E-45F;
        float divisor = 1.40130E-45F;
        Division instance = new Division();
        float expResult = 1F;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularDivision3() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 3.40282E+38F;
        float divisor = 3.40282E+38F;
        Division instance = new Division();
        float expResult = 1F;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularDivision4() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 1.40130E-45F;
        float divisor = 3.40282E+38F;
        Division instance = new Division();
        float expResult = (float) 4.1181E-084;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0);

    }

    @Test
    public void testCalcularDivision5() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 3.40282E+38F;
        float divisor = 1.40130E-45F;
        Division instance = new Division();
        float expResult = (float) 2.4283E+083;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularDivision6() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 1F;
        float divisor = 3F;
        Division instance = new Division();
        float expResult = 3.3333E-001F;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularDivision7() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 0F;
        float divisor = 1.40130E-45F;
        Division instance = new Division();
        float expResult = 0F;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularDivision8() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 1.40130E-45F;
        float divisor = 0F;
        Division instance = new Division();
        float expResult = ERROR;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0);
    }
}
