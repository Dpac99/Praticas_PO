public class GreenState extends Ticking {

    public GreenState (TrafficLight l){
        super(l);
    }

    public void tick(){
        _light.setState(new YellowState(_light));
    }

    public String toString(){
        return "Green light";
    }
}