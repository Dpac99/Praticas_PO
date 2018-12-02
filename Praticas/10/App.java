public class App {
     
    public static void main(String[] args) {

        Machine machine = new Machine();
        System.out.println();
        machine.on();
        machine.on();
        System.out.println();
        machine.sound();
        machine.on();
        System.out.println();
        machine.off();
        machine.off();
        System.out.println();
        machine.sound();
        machine.off();
        machine.on();
        machine.off();
        System.out.println();

        TrafficLight light = new TrafficLight();
        System.out.println("Light status: " + light.status());
        light.off();
        light.panic();
        light.on();
        light.tick();
        light.tick();
        light.tick();
        light.tick();
        light.panic();
        light.off();
        light.on();
        light.off();
        
    }
}