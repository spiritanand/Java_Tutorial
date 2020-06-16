public class B2_C_Apple extends B2_C_Computer { // The extends keyword is used to inherit from the superclass.

    // Now we can add a few of our own extra special methods that are special only to computers of Apple.

    private boolean glowLogo; // For the glowing apple logo.
    private boolean touchbar; // For the touchbar feature of the Apple laptops.

    public B2_C_Apple(String name, String model, double weight, int ports, double battery, boolean glowLogo,
                      boolean touchbar) {
        super(name, "OSX", model, weight, ports, battery); // The super keyword calls the superclass computer.
        // Here we are calling the superclass' constructor.
        // Now here the OS will always be OSX so we can set that to have a default value of OSX.
        // Now we can initialize the other unique states of the Apple subclass.
        this.glowLogo = glowLogo;
        this.touchbar = touchbar;
    }

    // Now we will create our getters.

    public boolean isGlowLogo() {
        return glowLogo;
    }

    public boolean isTouchbar() {
        return touchbar;
    }

    // Notice that we only need to create the getters for the unique states. Not only this, but we can also use
    // the methods of the superclass when we create objects of the subclass.

    // But suppose we know that while switching on the Apple computer also asks for fingerprint too. We need to
    // override the on so that is unique for this class.

    private void fingerprint(){
        System.out.println("Checking fingerprint.");
    }

    @Override
    public void on(){
        fingerprint();
        System.out.println("Called from the Apple subclass");
        super.on();
    }

    // This is how we override our inherited methods.

    // Now lets jump into Main2 class.
}
