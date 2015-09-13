/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raz
 */
public class CalculatorTest {

    public CalculatorTest() {
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
     * Test of operation method, of class Calculator.
     */
    @Test
    public void testOperation() {
        System.out.println("operation");
        int First = 1;
        int Second = 2;
        char Operation = '+';
        Calculator instance = new Calculator();
        Double expResult = 3.0;
        Double result = instance.operation(First, Second, Operation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    @Test
    public void testSum() {
        System.out.println("Sum");
        int First = 1;
        int Second = 2;
        char Operation = '+';
        Calculator instance = new Calculator();
        Double expResult = 3.0;
        Double result = instance.operation(First, Second, Operation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testMinus() {
        System.out.println("Minus");
        int First = 1;
        int Second = 2;
        char Operation = '-';
        Calculator instance = new Calculator();
        Double expResult = -1.0;
        Double result = instance.operation(First, Second, Operation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testDiv() {
        System.out.println("Division");
        int First = 1;
        int Second = 2;
        char Operation = '/';
        Calculator instance = new Calculator();
        Double expResult = 1.0;
        Double result = instance.operation(First, Second, Operation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    
    @Test
    public void testDiv2() {
        System.out.println("Division 2");
        int First = 1;
        int Second = 0;
        char Operation = '/';
        Calculator instance = new Calculator();
        Double expResult = 0.5;
        Double result = instance.operation(First, Second, Operation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testMult() {
        System.out.println("Multiply");
        int First = 1;
        int Second = 2;
        char Operation = '*';
        Calculator instance = new Calculator();
        Double expResult = 2.0;
        Double result = instance.operation(First, Second, Operation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

}
