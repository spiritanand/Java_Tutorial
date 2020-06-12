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

        // Alright now let us take a look at a new class named Account (for bank account). So jump into Account.

        Account LMAcc = new Account();
        LMAcc.setName("Lionel Messi");
        LMAcc.setAccountNumber(2012_91);
        LMAcc.setBalance(646_000);
        LMAcc.setPhone(2006091115);
        LMAcc.setEmail("Goat@Barca.com");

        // Alright now lets now withdraw money from this account

        LMAcc.withdraw(700_000); // He will not be able to withdraw money as he has insufficient funds.
        LMAcc.withdraw(123_000);
        LMAcc.deposit(1_000_000);

        // Alright all this works fine. Pretty great right. Well imagine doing this for 30 or s field variables.
        // That would be too cumbersome and lengthy. We do have a way to enter (to initialize) our parameters
        // in a different way. That would be using constructors. Lets see this in our class Account.
    }
}
