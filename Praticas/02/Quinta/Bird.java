public class Bird {
    private static int BASE_ENERGY = 20;
    private int _energy = BASE_ENERGY;
    private boolean _alive = true;

    public int getEnergy(){
        return _energy;
    }

    public boolean alive(){
        return _alive;
    }

    public boolean run(){
        if (getEnergy() <= 5){
            if (alive()) {
                sleep();
            }
            return false;
        }
        _energy -= 5;
        return true;
    }

    public boolean fly(){
        if (getEnergy() <= 2){
            if(alive()){
                sleep();
            }
            return false;
        }
        _energy -= 2;
        return true;
    }

    public void escaped(){
        _energy += 5;
    }

    public int drain(){
        int e = getEnergy();
        _energy = 0;
        return e;
    }

    public void sleep(){
        _energy = BASE_ENERGY;
    }

    public boolean equals(Object o){
        if (o instanceof Bird){
            Bird b = (Bird) o;
            return getEnergy() == b.getEnergy();
        }
        return false;
    }

    public String toString(){
        return "Bird has " + getEnergy() + " energy.";
    }
}