public abstract class Ticking extends TrafficLightState{

    public Ticking(TrafficLight t){
        super(t);
    }

    public void off(){
        _light.setState(new BlinkingState(_light));
    }

    public void panic(){
        _light.setState(new PanicState(_light));
    }

    public abstract void tick();
}