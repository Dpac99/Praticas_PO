public class Table {
    private int _ints[];
    
    public Table(int n){
        _ints = new int[n];
    }

    public int getValue(int pos){
        return _ints[pos];
    }

    public void setValue(int pos, int value){
        _ints[pos]=value;
    }

    public void setAll(int value){
        for(int i=0; i<_ints.length; i++){
            _ints[i]=value;
        }
    }

    public boolean contains(SelectionPredicate p){
        for(int i=0; i<_ints.length; i++){
            if(p.ok(_ints[i])){
                return true;
            }
        }
        return false;
    }
}
