public class Cat {
    private String _name;
    private int _age;
    private double _weight;
    
    public Cat(int a, String n, Double w){
        this.setAge(a);
        this.setName(n);
        this.setWeight(w);
    }

    public String getName(){
        return this._name;
    }

    public int getAge(){
        return this._age;
    }

    public double getWeight(){
        return this._weight;
    }

    public void setName(String n){
        this._name = n;
    }

    public void setAge(int a){
        this._age = a;
    }

    public void setWeight(double w){
        this._weight = w;
    }

    @Override
    public boolean equals(Object o){
        if  (o instanceof Cat){
            Cat cat = (Cat) o;
            return (this.getName().equals(cat.getName()) && cat.getAge() == this.getAge() && cat.getWeight() == this.getWeight());
        }
        return false;   
    }

    @Override
    @SuppressWarnings("nls")
    public String toString(){
        return (this.getName() + " is " + this.getAge() + " years old and weighs " + this.getWeight() + " kg.");
    }
}