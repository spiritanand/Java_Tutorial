public class B3_C_Car {
    // This will be the class where we use the classes of Body and Engine to make the class of Car.

    // Field Variables
    private String manufacturer;
    private String model;
    private B3_C_Engine engine; // The class Engine used as a part of this class.
    private B3_C_Body body;     // Same can be said about the class Body.

    // Constructors
    public B3_C_Car(String manufacturer, String model, B3_C_Engine engine, B3_C_Body body) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
        this.body = body;
    }

    // Getters
    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public B3_C_Engine getEngine() {
        return engine;
    }

    public B3_C_Body getBody() {
        return body;
    }

    // Now lets jump to B3_Main to see how all this works and other details.
}
