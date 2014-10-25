/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

public class Polinom {
    private float _a;
    private float _b;
    private float _c;
    
    Polinom(float a, float b, float c)
    {
        _a = a;
        _b = b;
        _c = c;
    }
    
    Root Desite()
    {
        double D;
        if (_a == 0 && _b == 0) {
            return Root.DegenerateEquation();
        }
        else if (_a == 0)
           return new Root(-_c/_b, -_c/_b);
        else if (_b == 0)
            return new Root(Math.sqrt(-_c/_a),-Math.sqrt(-_c/_a));
        else 
            D = _b * _b - 4 * _a * _c;
            if (D < 0)  return Root.NoRoots();
            D = Math.sqrt(D);
            return new Root((-_b  + D) / (2 * _a) , ((-_b  - D) / (2 * _a)));
    }
}