public abstract class NamedAnimal extends Animal {
    private String _name;

    public NamedAnimal(int base, int run, String name){
        super(base, run);
        _name  = name;
    }

    public String getName(){
        return _name;
    }

    public boolean equals(Object o){
        if (o instanceof NamedAnimal){
            NamedAnimal a = (NamedAnimal) o;
            return super.equals(o) && getName().equals(a.getName());
        }
        return false;
    }

    public String toString(){
        return super.toString() + " Name: " + getName();
    }
}