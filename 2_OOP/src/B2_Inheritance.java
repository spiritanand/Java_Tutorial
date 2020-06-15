public class B2_Inheritance {
    public static void main(String[] args) {
        // For learning object oriented programming we can learn by looking at the real world objects like
        // cars, animals, etc. We can think of classes as virtual blueprints and objects as real world objects,
        // things that have existence in the real world.
        //
        // Take for instance computers. Computers are every where around us. All the computers have many things
        // in similar like they all have an on and an off switch, whereas they may operate on different
        // operating systems, but the basic functionality of a computer is similar.
        // So it would be waste of our computer class if we do not use the methods and fields already present
        // in it. After all computer programming is all for reusability of code. So in our new class (subclass) of
        // Apple laptops we could "inherit" all the methods and field variables present in the computer
        // "superclass".
        //
        // Superclass - The class from which inherit.
        // Subclass - The class in which we inherit.
        // Inheritance is an important pillar for OOP and Java. Inheritance allows us the reusability of code.
        // Now let us jump into our new (super)class Computer.


        // Alright now we have seen inheritance in depth. There must be a few confusions brewing in you right
        // now. Let me clear a few of the confusions for you.
        //
        // this() v/s super() :-
        // Now the super() keyword is used for superclass members (variables and methods). It is used usually
        // in method overriding (not overloading) and also in calling the parent class' constructor for
        // initializing instance variables. The call to super() must be the first line of the constructor.
        // The this() keyword is used in the same class. It is required when we have a variable with the same name
        // as the instance variable. The this keyword is used commonly in constructors and setters as we have a
        // conflict of variable name. It maybe used optionally in the getters as there is no conflict there.
        // this() is used to call from a constructor another constructor overloaded in the same class and this
        // must be the first line of the constructor. This helps reducing duplicated code.
        // NOTE :- this() and super() cannot be used in the same constructor together.
        //
        // Method Overloading v/s Method Overriding :- I have added a .png file for seeing the difference between
        // them in a concise and tabular form.
        // Now you may not have heard of exceptions, we will be covering them in a future section.
    }
}
