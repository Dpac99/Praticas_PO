public class Cat
    extends NamedAnimal
    implements Predator{

        private int _catch_rate = 5;

        public Cat(String name){
            super(500, 25, name);
        }

        public void attacked(){
            alterEnergy(-25);
        }

        public boolean caught(Prey prey){
            run();
            prey.run();
            if(1 == (int)Math.random() * _catch_rate){
                return true;
            }
            prey.escape();
            return false;
        }

        public void eat(Prey prey){
            if(caught(prey)){
                alterEnergy(prey.drain());
            }
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