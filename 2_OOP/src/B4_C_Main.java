/*
To save time I will create one superclass and other subclasses (that inherit from the main superclass) right
here in this same file.
Usually it is done in separate files as it becomes easier to maintain.
 */

// The superclass.
class Footballer {
    private final String name;

    public Footballer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String specialMove() {
        return "Footballer's special move performed.";
    }
}

// The subclasses:-

class Leo extends Footballer {
    public Leo() {
        super("Lionel Messi");
    }

    @Override
    public String specialMove() {
        return "Dribbled past opponents and curled it past the goalkeeper to find the net.";
    }
}

class CR7 extends Footballer {
    public CR7() {
        super("Cristiano Ronaldo");
    }

    @Override
    public String specialMove() {
        return "Jumped 7 feet in the air.";
    }
}

class Ney extends Footballer {
    public Ney() {
        super("Neymar Jr.");
    }

    @Override
    public String specialMove() {
        return "Dumbfounded the opponents with a rainbow flick and crossed the ball to Striker.";
    }
}

class Mbappe extends Footballer {
    public Mbappe() {
        super("Kylian Mbappe");
    }

    @Override
    public String specialMove() {
        return "Ran past all opponents at 2X light speed";
    }
}

class Ramos extends Footballer {
    public Ramos() {
        super("Sergio Ramos");
    }

    @Override
    public String specialMove() {
        return "Panenka penalty taken.";
    }
}

class KDB extends Footballer {
    public KDB() {
        super("Kevin DeBruyne");
    }

    @Override
    public String specialMove() {
        return "No one saw that assist coming.";
    }
}

class PhilJones extends Footballer {
    public PhilJones() {
        super("Phil Jones");
    }
    // This player has no special move, hence here we are not overriding the specialMove method.
}

// Now that we have created the subclasses with overriding the same method.

public class B4_C_Main {

    // Now lets make a method that will return a random sub-class.
    // Keep in mind that this method will be returning a class of type "Footballer".

    public static Footballer randPlayer() {
        // Here we will return a random "int" greater than or equal to 1 and less than equal to 7.
        int randNum = (int) (Math.random() * 7) + 1;
        System.out.println("The random number generated is :- " + randNum);
        switch (randNum) {
            case 1:
                return new Leo();
            case 2:
                return new CR7();
            case 3:
                return new Ney();
            case 4:
                return new Mbappe();
            case 5:
                return new Ramos();
            case 6:
                return new KDB();
            case 7:
                return new PhilJones();
            default:
                return null;
        }
    }

    // Now that we have created the random player generator method  we will now see the functionality of the
    // polymorphism in action.

    public static void main(String[] args) {
        // To see the 10 random players we will use a for loop.

        for (int i = 1; i < 11; i++) {
            System.out.println("Player #" + i);
            Footballer player = randPlayer(); // This is known as "Dynamic Method Dispatch".
            // We are ensuring that instance returned is never null.
            assert player != null;
            System.out.println("Player name :- " + player.getName() + "\nSpecial move :- "
                    + player.specialMove() + "\n");
        }
        /*
         The player.specialMove() is what shows the concept of polymorphism the best. Here we get a
         unique/different output(function) for every different object of the superclass. Here java checks if
         the object returned has any method as specialMove() which is then executed from the sub-class if it
         exists it will execute it, else it will execute the method from the superclass. Here our function
          was very simple, we could build methods with more complex functionality to utilize the full power
           of polymorphism.
        */
    }
/*
This thus concludes our module 2 of our journey to become a better Java programmer.

Now you can try to build your own project using the concepts that you learnt in this section and the previous one.
Building a project or two from scratch will help you understand the concepts on a deeper level and get a better
grasp on them.
 */
}
