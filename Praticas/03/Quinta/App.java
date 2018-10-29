public class App {
    public static void main (String[] args){
        Dog d1 = new Dog("Piloto");
		Dog d2 = new Dog("Atila");
 
		Cat c1 = new Cat("Tareco");
		Cat c2 = new Cat("Pantufa");
		Cat c3 = new Cat("Kitty");
 
		Bird[] birds = new Bird[20];
		for (int ix = 0; ix < birds.length; ix++)
			birds[ix] = new Bird();
 
		Mouse[] mice = new Mouse[50];
		for (int ix = 0; ix < mice.length; ix++)
			mice[ix] = new Mouse();
 
		// snapshot: present everything
		System.out.println("BEFORE");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		for (int ix = 0; ix < birds.length; ix++)
			System.out.println(birds[ix]);
 
		for (int ix = 0; ix < mice.length; ix++)
			System.out.println(mice[ix]);
		
		// run, chase, eat, sleep, etc.
 
		for (int ix = 0; ix < birds.length; ix++)
			birds[ix].fly();
 
		d1.run();
		d2.attackCat(c1);

        for (int ix =0; ix < mice.length; ix++){
            if(d1.caughtMouse(mice[ix])){
                d1.eatMouse(mice[ix]);
            }
        }

		 for (int ix =0; ix < mice.length; ix++){
            if(d2.caughtMouse(mice[ix])){
                d2.eatMouse(mice[ix]);
            }
        }

		 for (int ix =0; ix < mice.length; ix++){
            if(c1.caughtMouse(mice[ix])){
                c1.eatMouse(mice[ix]);
            }
        }

		 for (int ix =0; ix < birds.length; ix++){
            if(c2.caughtBird(birds[ix])){
                c2.eatBird(birds[ix]);
            }
        }

		 for (int ix =0; ix < mice.length; ix++){
            if(c3.caughtMouse(mice[ix])){
				c3.eatMouse(mice[ix]);
            }
        }

 
		// snapshot: present everything
		System.out.println("AFTER");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
 
		for (int ix = 0; ix < birds.length; ix++)
			System.out.println(birds[ix]);
 
		for (int ix = 0; ix < mice.length; ix++)
			System.out.println(mice[ix]);
		
    }
}