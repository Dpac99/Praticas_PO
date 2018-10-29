public class MediumCar extends Car{
    public void changeEngine(){
        _engine = new EconomicEngine();
    }

    public void changeEngine(EconomicEngine e){
        _engine  = e;
    }

    public String toString(){
        return "Medium car with " + _engine;
    }
}