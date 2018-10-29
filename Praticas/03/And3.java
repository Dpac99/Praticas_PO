public class And3 extends And2 {
    
    private boolean _c = false;

    public And3(){}

    public And3( boolean a){
        super(a);
        _c = a;
    }

    public And3(boolean a, boolean b, boolean c){
        super(a,b);
        _c = c;
    }

    public boolean getC(){
        return _c;
    }

    public void setC(boolean c){
        _c = c;
    }

    public boolean getOutput(){
        return super.getOutput() && getC();
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof And3){
            And3 gate = (And3) o;
            return super.equals(gate) && getC() == gate.getC();
        }
        return false;
    }

    @Override
    public String toString(){
        return super.toString() + " C: " + getC();
    }

}
