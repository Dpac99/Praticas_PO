import java.util.Collections;
import java.util.TreeMap;
import java.util.List;


public class Album{
    private TreeMap<Integer,Card> _cards = new TreeMap<Integer,Card>();

    public void addCard(Card c){
        _cards.add(c.getNumber(),c);
    }

    public List<Card> getAll(){
        List<Card> all = new List<Card>();
        all.addAll(_cards.values());
        Collections.sort(all);
        return all;
    }

    public void remove(int id){
        _cards.remove(id);
    }

    public int size(){
        return _cards.size();
    }

    public boolean equals(Object o){
        if(o instanceof Album){
            Album a = (Album) o;
            return o.size() == size();
        }
        return false;
    }
}