public class BadGenie extends Genie {

    public BadGenie(int w){
        super(w);
    }

    public void grantWish() throws BadMoodException{
        if( getGrantedWishes() == 0){
            decrementWish();
        }
        throw new BadMoodException();
    }

    public String toString(){
        return getGrantedWishes()==1 ? "Bad genie has granted a wish." : "Bad genie has a wish to grant.";
    }
}