/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.ArrayList;

public class People {
    final private ArrayList _arrayOfPerson = new ArrayList();
    
    final public void People()
    {
    }
    
    public int size()
    {
        return _arrayOfPerson.size();
    }
    
    public void Generate(int count) throws Exception
    {
        if (count < 0 || count > 1000) throw new Exception();
        for (int i = 0; i < count; i++)
        {            
            try {
            _arrayOfPerson.add(new Person("Jack", "Pitt", 93));
            }
            catch (WrongAgeValueException ex)
            {
                System.out.println(ex);
            }
        }
    }
}