public class Mouse{
    private static int BASE_ENERGY = 50;
    private int _energy = BASE_ENERGY;
    private boolean _alive = true;

    public int getEnergy(){
        return _energy;
    }

    public boolean alive(){
        return _alive;
    }

    public boolean run(){
        if(getEnergy() <= 2){
            if (alive()){
                sleep();
            }
            return false;
        }
        _energy -= 2;
        return true;
    }

    public int drain(){
        int e = getEnergy();
        _energy = 0;
        return e;
    }

    public void escaped(){
        _energy += 5;
    }

    public void sleep(){
        _energy = BASE_ENERGY;
    }

    public boolean equals(Object o){
        if (o instanceof Mouse){
            Mouse m = (Mouse) o;
            return getEnergy() == m.getEnergy();
        }
        return false;
    }

    public String toString(){
        return "Mouse has " + getEnergy() + " energy.";
    }
}