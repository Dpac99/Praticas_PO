public class PreyAnimal
    extends Animal
    implements Prey {

        public PreyAnimal(int base, int run){
            super(base, run);
        }

        public void escape(){
            alterEnergy(5);
        }

        public int drain(){
            int a = getEnergy();
            setEnergy(0);
            return  a;
        } 


    }