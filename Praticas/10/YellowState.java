public class YellowState extends Ticking {

    public YellowState (TrafficLight l){
        super(l);
    }

    public void tick(){
        _light.setState(new RedState(_light));
    }

    public String toString(){
        return "Yellow light";
    }
}