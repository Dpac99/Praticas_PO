public abstract class State {
    protected Machine _mach;

    public State(Machine m){
        _mach = m;
    }

    public Machine getMachine(){
        return _mach;
    }

    public void sound(){}

    public abstract void on();
    public abstract void off();
}