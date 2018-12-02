public class TrafficLight {
    private TrafficLightState _state = new BlinkingState(this);

    public void tick(){
        System.out.print(_state + " ---(tick)---> ");
        _state.tick();
        System.out.println(_state);
    }

    public void on(){
        System.out.print(_state + " ---(on)---> ");
        _state.on();
        System.out.println(_state);
    }

    public void off(){
        System.out.print(_state + " ---(off)---> ");
        _state.off();
        System.out.println(_state);
    }

    public void panic(){
        System.out.print(_state + " ---(panic)---> ");
        _state.panic();
        System.out.println(_state);
    }

    public String status(){
        return _state.toString();
    }

    public void setState(TrafficLightState t){
        _state = t;
    }
}