public class B1_C_Main {
    public static void main(String[] args) {

        B1_C_Dog b1CDog1 = new B1_C_Dog(); // Here we will be initializing our object dog1 of the class Dog.

        // Now lets set the field variables.
        b1CDog1.setName("dog1");
        b1CDog1.setBreed("German Shepherd");
        b1CDog1.setFur(true);
        b1CDog1.setColor("Brown");

        // Right, now that we have set the field variables it is time to know whats its value is. We will call
        // the getters now.

        // Note :- The getter for the boolean type is a bit differently named by convention. Of course, you
        // could name this method whatever you like, utilize the POWER of OOP (POOP ~ 😂).

        System.out.println("The breed of " + b1CDog1.getName() + " is :- " + b1CDog1.getBreed() + ". " +
                "His colour is " + b1CDog1.getColor() + ". Fur on the dog = " + b1CDog1.isFur());

        // Using OOP makes our code is now more modular. Now we can create as many dogs as we want and all
        // that from a single class.

        // Alright now let us take a look at a new class named Account (for bank account). So jump into Account.

        B1_C_Account LMAcc = new B1_C_Account();
        LMAcc.setName("Lionel Messi");
        LMAcc.setAccountNumber(2012_91);
        LMAcc.setBalance(646_000);
        LMAcc.setPhone(2006091115);
        LMAcc.setEmail("Goat@Barca.com");

        System.out.println("The G.O.A.T. " + LMAcc.getName() + ", acc. no. as " + LMAcc.getEmail() +
                " and phone number is " + LMAcc.getPhone() + " has the balance = " + LMAcc.getBalance());

        // Alright now lets now withdraw money from this account

        LMAcc.withdraw(700_000); // He will not be able to withdraw money as he has insufficient funds.
        LMAcc.withdraw(123_000);
        LMAcc.deposit(1_000_000);

        // Alright all this works fine. Pretty great right. Well imagine doing this for 30 or so field
        // variables.
        // That would be too cumbersome and lengthy. We do have a better way to enter (to initialize) our
        // parameters in a different way. That would be using constructors. Lets see this in our class
        // Account.

        // Alright now that we have seen about constructors let us see the results.

        B1_C_Account def = new B1_C_Account(); // Using the default constructor.
        System.out.println("This is " + def.getName() + " has acc. no. " + def.getAccountNumber() +
                " has phone number as " + def.getPhone() + " and has balance equal to " + def.getBalance());
        // Pay close attention to the output messages when we are using the constructors and try to find the
        // reason behind the order of the messages.

        B1_C_Account sm = new B1_C_Account("spirit", 007, 1_000_000_000, "hacked@nomail.com",
                42);
        System.out.println("This is " + sm.getName() + " has acc. no. " + sm.getAccountNumber() +
                " has phone number as " + sm.getPhone() + " and has balance equals to " + sm.getBalance());
        // Again pay close attention to the out put messages that we have put in our constructors.
    }
}
