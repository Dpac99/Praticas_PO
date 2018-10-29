import java.util.Comparator;

public class Table implements Comparable<Table>{
    private int _ints[];
    public final static Comparator<Table> MAX_CMP = new MaxCmp();
    public final static Comparator<Table> Len_CMP = new LenCmp();
    
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

    public int sum(){
        int s = 0;
        for(int i : _ints){
            s += i;
        }
        return s;
    }

    public int getMax(){
        int m = getValue(0);
        for(int i: _ints){
            if(i>m){
                m = i;
            }
        }
        return m;
    }

    public int getSize(){
        return _ints.length;
    }

    public int compareTo( Table t){
        if(sum() < t.sum()){
            return -1;
        }
        return sum() == t.sum()? 0: 1;
    }

    private static class MaxCmp implements Comparator<Table>{
        public int compare(Table t1, Table t2){
            if(t1.getMax() < t2.getMax()){
                return -1;
            }
            return t1.getMax() == t2.getMax()? 0:1;
        }
    }

    private static class LenCmp implements Comparator<Table>{
        public int compare(Table t1, Table t2){
            if(t1.getSize() < t2.getSize()){
                return -1;
            }
            return t1.getSize() == t2.getSize()? 0:1;            
        }
    }

    public class Forward implements Iterator{
        int _current_pos=0;

        public boolean hasNext(){
            return _current_pos < getSize();
        }

        public int next(){
            return getValue(_current_pos++);
        }
    }
}
