public class RedState extends Ticking {

    public RedState (TrafficLight l){
        super(l);
    }

    public void tick(){
        _light.setState(new GreenState(_light));
    }

    public String toString(){
        return "Red light";
    }
}