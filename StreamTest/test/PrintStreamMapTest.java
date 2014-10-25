import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrintStreamMapTest {
    
    public PrintStreamMapTest() {
    }
    
    public static Map<Object, String> map;
    public static ByteArrayOutputStream outSpy;
    public static PrintStreamMap ps;

    @BeforeClass
    public static void setUpClass() throws Exception {
        map = new HashMap<Object, String>();
        map.put(new Integer(4), "four");
        map.put(new Float(2.5), "two and half");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        outSpy = new ByteArrayOutputStream();
        System.setOut(new PrintStreamMap(outSpy));
        ps = new PrintStreamMap (System.out);
    }
    
    @After
    public void tearDown() {
        System.setOut(null);
    }

    @Test
    public void ShouldDisplayOnConsoleMapWithSeparatorTabulating() {
        ps.print(map);
        assertEquals("4/four\t2.5/two and half", outSpy.toString());
    }
    
    @Test
    public void ShouldDisplayOnConsoleMapWithSeparatorNewLine() {
        ps.println(map);
        assertEquals("4/four\n2.5/two and half\n", outSpy.toString());
    }
    
    public void ShouldDisplayOnConsoleMapWithSeparatorEscape()
    {
        ps.print(map, " ");
        assertEquals("4/four 2.5/two and half", outSpy.toString());
    }
    
    public void ShouldDisplayOnConsoleMapWithSeparatorEscapeAndNewLine()
    {
        ps.println(map, " ");
        assertEquals("4/four 2.5/two and half\n", outSpy.toString());
    }
}