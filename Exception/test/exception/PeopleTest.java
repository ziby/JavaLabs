/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

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
public class PeopleTest {
    
    public PeopleTest() {
    }

    @BeforeClass
    public static void setUpPeople() throws Exception {
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

    @Test (expected = Exception.class)
    public void testGenerate1() throws Exception {
        People people = new People();
        people.Generate(-2);
    }
    
    @Test
    public void testGenerate2() throws Exception {
        People people = new People();
        people.Generate(50);
        assertEquals(50, people.size());
    }      
}
