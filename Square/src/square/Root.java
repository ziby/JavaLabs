package square;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class Root {
    double _root1;
    double _root2;
    boolean _flagDegenerate;
    boolean _flagNoRoots;
    
    Root (double root1, double root2)
    {
        _root1 = root1;
        _root2 = root2;
        _flagDegenerate = false;
        _flagNoRoots = false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this._root1) ^ (Double.doubleToLongBits(this._root1) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this._root2) ^ (Double.doubleToLongBits(this._root2) >>> 32));
        hash = 17 * hash + (this._flagDegenerate ? 1 : 0);
        hash = 17 * hash + (this._flagNoRoots ? 1 : 0);
        return hash;
    }
    
    @Override
    public boolean equals (Object obj)
    {
        if (obj == this) return true;
        if (obj == null) return false;
        if (!(getClass() == obj.getClass())) return false;
        Root root = (Root)obj;
        if (_flagDegenerate && root._flagDegenerate) return true;
        if (_flagNoRoots && root._flagNoRoots) return true;
        if (_root1 == root._root1 && _root2 == root._root2) return true;
        if (_root1 == root._root2 && _root2 == root._root1) return true;
        return false;
    }
    
    private Root (boolean flagDegenerate, boolean flagNoRoots)
    {
        _root1 = 0;
        _root2 = 0;
        _flagDegenerate = flagDegenerate;
        _flagNoRoots = flagNoRoots;
    }
    
    static Root DegenerateEquation()
    {
        return new Root(true, false);
    }
    
    static Root NoRoots()
    {
        return new Root(false, true);
    }
    
    String Tostring()
    {
        if (_root1 == _root2)
        return "Корень уравнения один:" + _root1;
        else if (this.equals(Root.NoRoots()))
        {
            return "действительных корней нет";
        }
        
        else if (this.equals(Root.DegenerateEquation()))
        {
            return "Вырожденное уравнение";
        }
        
        else 
        {
            return "x1 = " + _root1 + "\n x2 = " + _root2;
        }
    }
}
