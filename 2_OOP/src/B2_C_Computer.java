public class B2_C_Computer {
    // This is our superclass named Computer. A superclass is no different from a normal class. We can now
    // start to make our field variables.
    private String name;
    private String OS;
    private String model;
    private double weight;
    private int ports;
    private double battery;

    // Now let us create our constructor, so we can initialize our field variables.

    public B2_C_Computer(String name, String OS, String model, double weight, int ports, double battery) {
        System.out.println("Computer (super)class constructor called.");
        this.name = name;
        this.OS = OS;
        this.model = model;
        this.weight = weight;
        this.ports = ports;
        this.battery = battery;
    }

    // Now let us create getters.

    public String getName() {
        return name;
    }

    public String getOS() {
        return OS;
    }

    public String getModel(){
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public int getPorts() {
        return ports;
    }

    public double getBattery() {
        return battery;
    }

    // Now let us create a few methods.
    public void on(){
        System.out.println("Starting machine.");
    }

    public void off(){
        System.out.println("Turning off machine.");
    }

    public void calculate(){
        System.out.println("Calculating.");
    }

    // Now let us jump into our B2_C_Main class to have some fun.
}
