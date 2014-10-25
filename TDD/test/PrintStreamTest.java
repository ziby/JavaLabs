/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.io.FileOutputStream;
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
public class PrintStreamTest {
    
    public PrintStreamTest() {
    }
    
    @Test
    public void TestPrint() throws FileNotFoundException 
    {
        PrintStream ps = new PrintStream(new FileOutputStream(new File("/home/vlad/NetBeansProjects/TDD/test.txt")));   
        ps.print("qwerty: ");
        ps.print(1.88);
        ps.println();
        ps.printf("%.8f",1.8787876888);
        ps.println();
        
        class MyClass
            {
                private int _a;
                private double _b;
                MyClass(int a, double b)
                {
                    _a = a;
                    _b = b;
                }
                
                @Override
                public String toString()
                {
                    return "int: " + _a + "\nfloat: " + _b;
                }
            }
        MyClass myClass = new MyClass(10, 2.8);
        
        ps.println (myClass);
        ps.close();
        
        //assertEquals(
                //FileUtils.readFileToString (new File("/home/vlad/NetBeansProjects/TDD/test.txt")), 
                //FileUtils.readFileToString (new File("/home/vlad/NetBeansProjects/TDD/testExpected.txt")));  
    }
}
