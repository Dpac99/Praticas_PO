public class TopCar extends MediumCar{
    private XtremeEngine _xtreme = null;

    public void addEngine(){
        if(_xtreme == null ){
            _xtreme = new XtremeEngine();
        }
    }

    public void addEngine(XtremeEngine x){
        if(_xtreme == null){
            _xtreme = x;
        }
    }

    public void run(){
        if(_xtreme != null){
            _xtreme.start();
        }
        super.run();
    }

    public void stop(){
        if(_xtreme != null){
            _xtreme.stop();
        }
        super.stop();
    }

    public String toString(){
        return "Top car with " + _engine + ((_xtreme == null)? "" : ("and extra " + _xtreme));
    }

    public boolean equals(Object o){
        if( o instanceof TopCar){
            TopCar t = (TopCar) o;
            return (t._xtreme!= null) &&  (_xtreme!= null);
        }
        return false;
    }
}