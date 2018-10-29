import arabiannights.*;

public class App {
 
	public static void main(String args[]) {
 
		MagicLamp m = new MagicLamp(4);
		Genie gv[] = { m.rub(2), m.rub(3), m.rub(4), m.rub(5), m.rub(1) };
		for (Genie g : gv) System.out.println(g);
 
		System.out.println("======================");
 
		for (Genie g : gv) g.grantWish();
		for (Genie g : gv) System.out.println(g);
 
		System.out.println("======================");
 
		for (Genie g : gv) g.grantWish();
		for (Genie g : gv) System.out.println(g);
 
		System.out.println("======================");
 
		
		m.feedDemon((Demon) gv[4]);
		Genie g = m.rub(7);
		System.out.println(g);
 
		System.out.println("======================");
 
	}
 
}
