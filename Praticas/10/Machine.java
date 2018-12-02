public class Machine{
    private State _state = new NormalState(this);

    protected void setState(State s){
        _state = s;
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

    public void sound(){
        System.out.print(_state + " ---(sound)---> ");
        _state.sound();
        System.out.println(_state);
    }
}