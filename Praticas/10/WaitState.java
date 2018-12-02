public class WaitState extends State{

    public WaitState(Machine m){
        super(m);
    }

    public void on(){
        _mach.setState(new TestState(_mach));
    }

    public void off(){
        _mach.setState(new NormalState(_mach));
    }

    public String toString(){
        return "Wait State";
    }
}