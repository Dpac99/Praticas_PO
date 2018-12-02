public class MagicLamp{
    //private variables
    private int _rubs;
    final private int _capacity;
    private int _genies;
    private int _demons = 0;

    //public methods

    public MagicLamp(int c){
        _capacity = _genies = c;
    }

    public int getCapacity(){
        return _capacity;
    }

    public int getRubs(){
        return _rubs;
    }

    public int getGenies(){
        return _genies;
    }

    public int getDemons(){
        return _demons;
    }

    public void feedDemon(Demon d){
        if(!d.recycled()){
            d.recycle();
            _demons++;
            _genies = _capacity;
        }
    }

    public Genie rub(int wishes){
        if(_genies > 0){
            _genies--;
            if(++_rubs % 2 == 0){
                return new GoodGenie(wishes);
            }
            return new BadGenie(wishes);
        }
        return new Demon(wishes);
    }

    public boolean equals(Object o){
        if (o instanceof MagicLamp){
            MagicLamp m = (MagicLamp) o;
            return getRubs() == m.getRubs() && 
                        getCapacity() == m.getCapacity() &&
                        getDemons() == m.getDemons() &&
                        getGenies() == m.getGenies();
        }
        return false;
    }
}