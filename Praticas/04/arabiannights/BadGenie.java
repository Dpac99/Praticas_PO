package arabiannights;

public class BadGenie extends Genie {

    public BadGenie(int w){
        super(w);
    }

    public boolean grantWish(){
        if( getGrantedWishes() == 0){
            return decrementWish();
        }
        return false;
    }

    public String toString(){
        return getGrantedWishes()==1 ? "Bad genie has granted a wish." : "Bad genie has a wish to grant.";
    }
}