public class Car{
    protected EconomicEngine _engine;

    public Car(){
        _engine = new EconomicEngine();
    }

    public Car(EconomicEngine e){
        _engine  = e;
    }

    public void run(){
        _engine.start();
        System.out.println("Car is running");
    }

    public void stop(){
        _engine.stop();
        System.out.println("Car stopped.");
    }

    public String toString(){
        return "Basic car with " + _engine; 
    }
}