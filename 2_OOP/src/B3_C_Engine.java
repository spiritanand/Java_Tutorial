public class B3_C_Engine {
    // This will be a pretty straight forward class and here we will create a few state variables.
    private double thrust;
    private double efficiency;
    private double power;

    // Now lets create the constructor of this class.
    public B3_C_Engine(double thrust, double efficiency, double power){
        this.thrust = thrust;
        this.efficiency = efficiency;
        this.power = power;
    }

    // Now lets create some methods.
    public void accelerate() {
        System.out.println("Accelerating.");
    }

    public void brake() {
        System.out.println("Applying brakes.");
    }

    // Now lets make the getters.
    public double getThrust() {
        return thrust;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public double getPower() {
        return power;
    }

    // Now lets check out the other class of Body(B3_C_Body)
}
