/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vlad
 */
public class PolinomTest {
    
    public PolinomTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testDesite_1() {
        Polinom instance = new Polinom (0,0,1);
        Root expResult = Root.DegenerateEquation();
        Root result = instance.Desite();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDesite_2() {
        System.out.println("Desite");
        Polinom instance = new Polinom (0,2,1);
        Root expResult = new Root(-0.5, -0.5);
        Root result = instance.Desite();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDesite_3() {
        System.out.println("Desite");
        Polinom instance = new Polinom (4,0,-1);
        Root expResult = new Root(0.5, -0.5);
        Root result = instance.Desite();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDesite_4() {
        System.out.println("Desite");
        Polinom instance = new Polinom (1,-2,-3);
        Root expResult = new Root( -1 , 3 );
        Root result = instance.Desite();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDesite_5()
    {
        System.out.println("Desite");
        Polinom instance = new Polinom (1,2,3);
        Root expResult = Root.NoRoots();
        Root result = instance.Desite();
        assertEquals(expResult, result);
    }
}
