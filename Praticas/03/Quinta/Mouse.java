public class Mouse extends Animal{

    public Mouse(){
        super(50, 2);
    }

    public int drain(){
        int e = getEnergy();
        setEnergy(0);
        return e;
    }

    public void escaped(){
        alterEnergy(5);
    }

    public boolean equals(Object o){
        if (o instanceof Mouse){
            return super.equals(o);
        }
        return false;
    }

    public String toString(){
        return "Mouse: " + super.toString();
    }
}