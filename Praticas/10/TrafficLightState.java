public abstract class TrafficLightState {
    protected TrafficLight _light;

    public TrafficLightState(TrafficLight l){
        _light = l;
    }

    public void on(){}
    public abstract void off();
    public abstract void panic();
    public abstract void tick();
}