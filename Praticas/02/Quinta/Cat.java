public class Cat {
    private static int BASE_ENERGY = 500;
    private String _name;
    private int _energy = BASE_ENERGY;

    public Cat(String n){
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
        if (getEnergy() <= 25){
            sleep();
            return false;
        }
        _energy -= 25;
        return true;
    }

   public boolean caughtMouse(Mouse m){
        if(m.alive()){
           if (run()){
               if (0 == (int)(Math.random() * 5) || !m.run()){
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

    public boolean caughtBird(Bird b){
        if(b.alive()){
           if (run()){
               if (0 == (int)(Math.random() * 10) || !b.run()){
                return true;
            }
           }
           b.escaped();
        }
        return false;
    }

    public void eatBird(Bird b){
        _energy += b.drain();
    }

    public void sleep(){
        _energy = BASE_ENERGY;
    }

    public void attacked(){
        _energy -= 25;
    }

    public boolean equals(Object o){
        if( o instanceof Cat){
            Cat c = (Cat) o;
            return equals(c.getName()) && getEnergy() == c.getEnergy();
        }
        return false;
    }

    public String toString(){
        return getName() + " has " + getEnergy() + " energy.";
    }
}