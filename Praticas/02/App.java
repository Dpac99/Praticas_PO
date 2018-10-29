public class App{
    public static void main (String[] args){
        Cat c = new Cat(12, "Bolinha", 20.0);
        System.out.println(c.equals(new Cat(12, "Bolinha", 20.0)));
        System.out.println(c.equals(new Cat(10, "Tareco", 21.2)));
        System.out.println(c);
    }
}