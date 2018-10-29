public class Cat extends NamedAnimal {

    public Cat(String n){
        super(500, 25, n);
    }

   public boolean caughtMouse(Mouse m){
       if ((0 == (int)(Math.random() * 5) || !m.run()) && run()){
           return true;
       }
       m.escaped();
       return false;
    }

    public void eatMouse(Mouse m){
        alterEnergy(m.drain());
    }

    public boolean caughtBird(Bird b){
        if ((0 == (int)(Math.random() * 10) || !b.run()) && run()){
            return true;
        }
        b.escaped();
        return false;
    }

    public void eatBird(Bird b){
        alterEnergy(b.drain());
    }

    public void attacked(){
        alterEnergy(-25);
    }

    public boolean equals(Object o){
        if( o instanceof Cat){
            return super.equals(o);
        }
        return false;
    }

    public String toString(){
        return "Cat: " + super.toString();
    }
}