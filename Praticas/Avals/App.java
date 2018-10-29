public class App {
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car(new EconomicEngine());

        MediumCar m1 = new MediumCar();

        TopCar t1 = new TopCar();
        TopCar t2 = new TopCar();

        t1.addEngine();

        System.out.println("t1 == t2?" + (t1.equals(t2)? "true": "false"));

        t2.addEngine();

        System.out.println("t1 == t2?" + (t1.equals(t2)? "true": "false"));

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(m1);
        System.out.println(t1);
        System.out.println(t2);

        c1.run();
        c2.run();
        m1.run();
        t1.run();
        t2.run();

        c1.stop();
        c2.stop();
        m1.stop();
        t1.stop();
        t2.stop();


    }
}