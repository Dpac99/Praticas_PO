public class Demon extends Genie{

    private boolean _recycled = false;

    public Demon(int w){
        super(w);
    }

    public boolean recycled(){
        return _recycled;
    }

    public void grantWish() throws OopsException, TiredOhSoTiredException {
        if(!recycled()){
            throw new OopsException();
        }
        throw new TiredOhSoTiredException();
    }

    public void recycle(){
        _recycled = true;
    }

    public String toString(){
        return recycled()? "Demon has been recycled." : "Recyclable demon has granted "+ getGrantedWishes() +" wishes";
    }
}