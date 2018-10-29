public abstract class Animal {
    private final int _base_energy;
    private int _energy;
    private final int _run_energy;

    public Animal(int base, int run){
        _energy = _base_energy = base;
        _run_energy = run;
    }

    public int getEnergy(){
        return _energy;
    }

    public int getBaseEnergy(){
        return _base_energy;
    }

    public int getRunEnergy(){
        return _run_energy;
    }

    public void setEnergy(int amount){
        _energy = amount;
    }

    public void alterEnergy(int amount){
        _energy += amount;
    }

    public void run(){
        if (getEnergy() >= getRunEnergy()){
            alterEnergy(- getRunEnergy());
        }
    }

    public void sleep(){
        _energy = _base_energy;
    }

    public boolean equals(Object o){
        if( o instanceof Animal){
            Animal a = (Animal) o;
            return getBaseEnergy() == a.getBaseEnergy() &&getEnergy() == a.getEnergy() && getRunEnergy() == a.getRunEnergy();
         }
         return false;
    }

    public String toString(){
        return "Base energy: " + getBaseEnergy() + " Energy: " + getEnergy() + " Run energy: " + getRunEnergy();
    }
}