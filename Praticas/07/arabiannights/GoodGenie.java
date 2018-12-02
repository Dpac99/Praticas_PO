public class GoodGenie extends Genie{

    public GoodGenie(int w){
        super(w);
    }

    public void grantWish() throws NoMoreWishesException{
        if(! decrementWish()){
            throw new NoMoreWishesException();
        }
    }

    public String toString(){
        return "Friendly genie has granted" + getGrantedWishes()+ " wishes and still has " + getRemainingWishes() +" to grant";
    }

}