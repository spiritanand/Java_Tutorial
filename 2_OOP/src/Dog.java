public class Dog { // The first letter of any class should start with a capital letter. This statement creates
    // a new class of the name Dog.

    // public is the access modifier that is used to determine what restrictions do other have on accessing
    // this class. public states that others have full and unrestricted access to this class. Other access
    // modifiers include private, protected and we can also have no access modifier. We will be talking about
    // access modifiers in much more depth in future sections.

    // Now as a general rule when we will be defining fields (variables of a class) we will be using the access
    // modifier private. This is done to adhere to the fact that only the internals of the class can access
    // these variables. They are hidden from the user. This is called encapsulation. The internal representation
    // of an object is going to be hidden from external view.
    // Now lets create a few (private) field variables.

    private String name;
    private String breed;
    private boolean fur;
    private String color;

    // So these are our 4 field variables.

    // One important thing to note is that (as we have discussed in previous sections) String is a class in
    // itself and is not a primitive data type. So we can have a class within a class.

    // Apart from these field variables when we initialize an object in the Main java automatically creates a
    // few methods like equals and getClass.

    // Now as I have stated before the fields cannot be accessed directly by the user. So how exactly does a
    // user use these variables? Well to use these fields we need to create a few standard public methods knows as
    // setters to assign value to our field and another public method getters to send the field value.

    // This is how we are going to create setters.

    public void setName(String name) {
        this.name = name; // Now since our parameter name is same as the field variable name we need a way of
        // differentiating between the two. So for this purpose we use the this keyword. this.name refers to
        // our field variable and we are assigning it the value of the parameter.
    }

    // Now the great thing about using setters is that we can add conditions and accept fields only if they
    // satisfy those conditions. Lets say there are only 2 valid breeds in this world namely, German Shepherd
    // and Labrador. Other tha those too any other breed will be given the value of Too Exotic
    public void setBreed(String breed) {
        if ((breed.equals("Labrador")) || (breed.equals("German Shepherd"))) {
            this.breed = breed;
        } else {
            this.breed = "Too Exotic";
        }
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Now that the user can set the values of these fields we also need to create getters so that the user can
    // use these values for various purposes.

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public boolean isFur() {
        return this.fur;
    }

    public String getColor() {
        return this.color;
    }

    // Now lets jump into the Main class and have some fun!!!
}
