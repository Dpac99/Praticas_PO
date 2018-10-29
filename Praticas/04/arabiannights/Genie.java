package arabiannights;

abstract public class Genie {
    //private variables
    private int _total;
    private int _wishes;

    //public methods
    public Genie(int w){
        _total = _wishes = w;
    }

    public abstract boolean grantWish();

    public boolean decrementWish(){
        if(getRemainingWishes() > 0){
            _wishes--;
            return true;
        }
        return false;
    }

    public int getGrantedWishes(){
        return _total - _wishes;
    }

    public int getTotal(){
        return _total;
    }

    public int getRemainingWishes(){
        return _wishes;
    }
}