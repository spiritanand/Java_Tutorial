public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog(); // Here we will be initializing our object dog1 of the class Dog.

        // Now lets set the field variables.
        dog1.setName("dog1");
        dog1.setBreed("German Shepherd");
        dog1.setFur(true);
        dog1.setColor("Brown");

        // Right, now that we have set the field variables it is time to know whats its value is. We will call
        // the getters now.

        // Note :- The getter for the boolean type is a bit different by convention. Of course, you could name
        // this method whatever you like, utilize the POWER OF OOP (POOOP).

        System.out.println("The breed of " + dog1.getName() + " is :- " + dog1.getBreed() + ". " +
                "His colour is " + dog1.getColor() + ". Fur on the dog = " + dog1.isFur());

        // Using OOP makes our code more modular. Now we can create as many dogs as we want and all that from a
        // single class.
    }
}
