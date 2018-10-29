public class EqualTo implements SelectionPredicate{
    private int _value;

    public EqualTo(int value){
        _value = value;
    }

    public boolean ok(int v){
        return v == _value;
    }
}
