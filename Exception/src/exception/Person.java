/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

public class Person {
    
    private String _firstName;
    private String _lastName;
    private int _age;
            
    
    public Person (String firstName, String lastName, int age) throws WrongAgeValueException
    {
        _firstName = firstName;
        _lastName = lastName;
        setAge(age);
    }

    final void setAge(int age) throws WrongAgeValueException
    {
        if (age < 0 || age > 150)
            throw new WrongAgeValueException();
        else
        {
            _age = age;
        }
    }      
}