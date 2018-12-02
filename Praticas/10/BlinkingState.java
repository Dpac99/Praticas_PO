public class BlinkingState extends TrafficLightState {

    public BlinkingState(TrafficLight t){
        super(t);
    }

    public void on(){
        _light.setState(new RedState(_light));
    }

    public void off(){}

    public void tick(){}

    public void panic(){
        _light.setState(new PanicState(_light));
    }

    public String toString(){
        return "Blinking";
    }

}