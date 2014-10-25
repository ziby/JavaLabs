import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.PrintStream;
import static org.junit.Assert.*;

public class PrintStreamJUnitTest {
    
    public PrintStreamJUnitTest() {
    }
    
    public static PrintStream ps;
    //public static PrintStreamMap ps;
    public static ByteArrayOutputStream outSpy;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception { 
    }
    
    @Before
    public void setUp() throws IOException {
        outSpy = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outSpy));
        ps = new PrintStream (System.out);
        
        //System.setOut(new PrintStreamMap(outSpy));
        //ps = new PrintStreamMap (System.out);
    }
    
    @After
    public void tearDown() throws IOException {
        System.setOut(null);
    }
    
    @Test
    public void ShouldDisplayOnConsoleHello() 
    {
        ps.print("hello");
        assertEquals("hello", outSpy.toString());
    }
    
    @Test
    public void ShouldDisplayOnConsoleHelloAndNewLine()
    {
        ps.println("hello");
        assertEquals("hello\n", outSpy.toString());
    }
    
    @Test
    public void ShouldDisplayOnConsoleDouble()
    {
        double f = 24.3;
        ps.print(f);
        assertEquals("24.3", outSpy.toString());
    }
    
    @Test
    public void ShouldDisplayOnConsoleStringFormatWithFloat()
    {
        double f = 24.3;
        ps.printf("Float: %.4f", f);
        assertEquals("Float: 24,3000", outSpy.toString());
    }
}