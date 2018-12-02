public class NormalState extends State {
    
    public NormalState(Machine m){
        super(m);
    }

    public void on(){
        _mach.setState(new TestState(_mach));
    }

    public void off(){
        _mach.setState(new WaitState(_mach));
    }

    public void sound(){
        _mach.setState(new AlarmState(_mach));
    }

    public String toString(){
        return "Normal State";
    }
}