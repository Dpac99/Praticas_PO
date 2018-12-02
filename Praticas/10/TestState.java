public class TestState extends State{

    public TestState(Machine m){
        super(m);
    }

    public void on(){
        _mach.setState(new NormalState(_mach));
    }

    public void off(){
        _mach.setState(new WaitState(_mach));
    }

    public String toString(){
        return "Test State";
    }
}