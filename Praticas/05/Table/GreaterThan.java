public class GreaterThan implements SelectionPredicate{
    private int _value;

    public GreaterThan(int v){
        _value = v;
    }

    public boolean ok(int v){
        return _value > v;
    }
}
