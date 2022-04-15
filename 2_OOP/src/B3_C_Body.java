public class B3_C_Body {
    // Field variables.
    private String material;
    private B3_C_Dimensions dimensions; // Check out the B3_C_Dimensions class. Dimensions is another class which
    // will be used in the class of Body. This is an example of "composition" as well.
    private String color;

    // Constructors
    public B3_C_Body(String material, B3_C_Dimensions dimensions, String color) {
        this.material = material;
        this.dimensions = dimensions;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    // Method
    public void changeColor(String newColor) {
        color = newColor;
        System.out.println("The color has been changed to " + newColor);
    }

    // Getters
    public B3_C_Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }

    // Now lets see how the components Body and Engine will be used to make the class of Car(B3_C_Car).
}
