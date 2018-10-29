public class Dog 
    extends NamedAnimal 
    implements Predator{
        
        private int _catch_rate = 10;

        public Dog(String n){
            super(1000, 25, n );
        }

        public void attackCat(Cat cat){
            alterEnergy(-100);
            cat.attacked();
        }

        public void eat(Prey prey){
            if(caught(prey)){
                alterEnergy(prey.drain());
            }
        }

        public boolean caught(Prey prey){
            run();
            prey.run();
            if( 1 == Math.random() * _catch_rate){
                return true;
            }
            prey.escape();
            return false;
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