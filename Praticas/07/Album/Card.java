public class Card implements Comparable{
    private int _number;
    private Image _image;

    public Card(int n, Image i){
        _number=n;
        _image=i;
    }

    public int getNumber(){
        return _number;
    }

    public Image getImage(){
        return _image;
    }

    public compareTo(Card c){
        return _number - c.getNumber();
    }
}