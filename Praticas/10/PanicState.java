public class PanicState extends TrafficLightState {

    public PanicState(TrafficLight t){
        super(t);
    }

    public void on(){
        _light.setState(new RedState(_light));
    }

    public void off(){}

    public void tick(){}

    public void panic(){}

    public String toString(){
        return "Panic";
    }

}