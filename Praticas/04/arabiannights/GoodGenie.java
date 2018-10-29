package arabiannights;

public class GoodGenie extends Genie{

    public GoodGenie(int w){
        super(w);
    }

    public boolean grantWish(){
        return decrementWish();
    }

    public String toString(){
        return "Friendly genie has granted" + getGrantedWishes()+ " wishes and still has " + getRemainingWishes() +" to grant";
    }

}