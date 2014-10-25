import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PrintStreamMap extends PrintStream {
    
    // Конструкторы
    
    PrintStreamMap(File file, String string) throws FileNotFoundException, UnsupportedEncodingException
    {
        super (file, string);
    }
    
    PrintStreamMap(File file) throws FileNotFoundException
    {
        super (file);
    }
    
    PrintStreamMap(String string) throws FileNotFoundException
    {
        super (string);
    }
    
    PrintStreamMap (OutputStream outStream)
    {
        super(outStream);
    }
    
    PrintStreamMap (OutputStream outStream, boolean bool)
    {
        super (outStream, bool);
    }
    
    PrintStreamMap (OutputStream outStream, boolean bool, String string) throws UnsupportedEncodingException
    {
        super (outStream, bool, string);
    }
    
    // Методы
    private Iterator SetIterator(Map map)
    {
        Set s = map.entrySet();
        Iterator it = s.iterator();
        return it;
    }
    
    private String StringForOutput(Map map, String separator)
    {
        Iterator it = SetIterator(map);
        String result = "";
        while (it.hasNext())
        {
            Map.Entry m = (Map.Entry)it.next();
            result += m.getKey() + "/" + m.getValue();
            if (it.hasNext()) result += separator;
        }
        return result;
    }
    
    public void print (Map map)
    {
        String result = StringForOutput(map,"\t");
        super.print(result);
    }
    
    public void println (Map map)
    {
        String result = StringForOutput (map, "\n");
        super.println(result);
    }
    
    public void print (Map map, String separator)
    {
        String result = StringForOutput(map,separator);
        super.print(result);
    }
    
    public void println (Map map, String separator)
    {
        String result = StringForOutput (map, separator);
        super.println(result);
    }
}