public class Dog extends NamedAnimal {

    public Dog(String n){
        super(1000, 50, n);
    }

    public boolean caughtMouse(Mouse m){
        if ((0 == (int)(Math.random() * 25) || !m.run()) && run()){
            return true;
        }
        m.escaped();
        return false;
    }

    public void eatMouse(Mouse m){
         alterEnergy(m.drain());
    }

    public void attackCat(Cat c){
        alterEnergy(-100);
        c.attacked();
    }

    public boolean equals(Object o){
        if(o instanceof Dog){
            return super.equals(o);
        }
        return false;
    }

    public String toString(){
        return "Dog: " + super.toString();
    }
}