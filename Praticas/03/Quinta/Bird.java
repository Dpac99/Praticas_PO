public class Bird extends Animal {

    public Bird(){
        super(20,5);
    }

    public boolean fly(){
        if (getEnergy() <= 2){
            return false;
        }
        alterEnergy(-2);
        return true;
    }

    public void escaped(){
        alterEnergy(5);
    }

    public int drain(){
        int e = getEnergy();
        setEnergy(0);
        return e;
    }

    public boolean equals(Object o){
        if (o instanceof Bird){
            return super.equals(o);
        }
        return false;
    }

    public String toString(){
        return "Bird: " + super.toString();
    }
}