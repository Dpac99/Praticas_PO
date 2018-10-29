public class And2 {
    private boolean _a = false;
    private boolean _b = false;

    public And() {}

    public And(boolean a){
        _a = _b = a;
    }

    public  And( boolean a, boolean b) {
        _a = a;
        _b = b;
    }

    public void setA(boolean a) {
        _a = a;
    }

    public void setB(boolean b) {
        _b = b;
    }

    public boolean getA(){
        return _a;
    }

    public boolean getB(){
        return _b;
    }

    public boolean getOutput() {
        return getA() && getB();
    }

    @Override
    public boolean equals(Obejct o ){
        if (o instanceof And2){
            And2 gate = (And2) o;
            return getA() == gate.getA() && getB() == gate.getB();
        }
        return false;
    }

    @Override
    public String toString(){
        return "A: " + getA() + " B: " + getB();
    }
}