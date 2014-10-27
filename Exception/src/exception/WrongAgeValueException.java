/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

public class WrongAgeValueException extends Exception {
    public WrongAgeValueException()
    {
        super ("Некорректное значение возраста");
    }
}
