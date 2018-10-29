public class Bird
    extends PreyAnimal{

        public Bird(){
            super(20, 5);
        }

        public void fly(){
            if(getEnergy() >=2){
                alterEnergy(-2);
            }
        }

        public String toString(){
            return "Bird: " + super.toString();
        }
    }