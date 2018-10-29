public class Dog {
    private static int BASE_ENERGY = 1000;
    private String _name;
    private int _energy = BASE_ENERGY;

    public Dog(String n){
        setName(n);
    }

    public String getName(){
        return _name;
    }

    public int getEnergy(){
        return _energy;
    }

    public void setName(String n){
        _name = n;
    }

    public boolean run(){
        if(_energy < 50){
            sleep();
            return false;
        }
        _energy -= 50;
        return true;
    }

    public boolean caughtMouse(Mouse m){
        if(m.alive()){
           if (run()){
               if (0 == (int)(Math.random() * 25) || !m.run()){
                return true;
            }
           }
           m.escaped();
        }
        return false;
    }

    public void eatMouse(Mouse m){
        _energy += m.drain();
    }

    public void attackCat(Cat c){
        _energy -= 100;
        c.attacked();
    }

    public void sleep(){
        _energy = BASE_ENERGY;
    }

    public boolean equals(Object o){
        if(o instanceof Dog){
            Dog dog = (Dog) o;
            return equals(dog.getName()) && getEnergy() == dog.getEnergy();
        }
        return false;
    }

    public String toString(){
        return getName()+" has "+getEnergy()+" energy.";
    }
}