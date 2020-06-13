public class Account {
    // Now let us create our important field variables
    private String name;
    private double balance;
    private int accountNumber;
    private String email;
    private int phone;

    // Now is the time to create our setters and getters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }


    // Now is the time to create a few methods for our class. Lets create two basic methods that are withdrawal
    // and for depositing of money. Of course for withdrawal we need to check if there are sufficient funds.

    // One important thing to note is that our method will not be a static one.
    public void withdraw(double money_out) {
        if (money_out > this.balance) {
            System.out.println("Insufficient funds. Total balance = " + this.balance);
        } else {
            this.balance -= money_out;
            System.out.println("Money withdrawn. Total balance = " + this.balance);
        }
    }

    public void deposit(double money_in) {
        this.balance += money_in;
        System.out.println("Money added. Total balance = " + this.balance);
    }

    // Now lets jump back into our Main class.


    // Right by now you have realised that setting parameters is a bit too cumbersome the way we do it. So lets
    // see how we initialize our field variables using constructors.
    // So a constructor is already created by default when we initialize our class with the keyword "new".

    // Let us create a constructor. Now a constructor is special as it does not have a return type (not even
    // void). The name of our constructor should be same as that of the class.

    public Account(String name, int accountNumber, double balance, String email, int phone) { // Main Constructor
        System.out.println("Our constructor has been created.");
        this.name = name; // Alternative way --> setName(name); // Now this is a really smart way as this allows
        // to check for any conditions that we might had put in the set. But the real big disadvantage of using
        // this is when we will be using inheritance.
        // So it is best practice to initialize by this method.
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.email = email;
        this.phone = phone;
    }

    // Not only that, but Java also allows us to overload constructors. Now why would we want to ever want to
    // overload constructors. Well the answer lies in setting default values. We can use the keyword "this" in our
    // other constructor(s) and that would call the Main Constructor to initialize values.

    // Lets see a few examples :-

    public Account() { // Empty Constructor
        this("Default", 11111111, 1_000_000, "default@email.com", 123456789);
        // The above line which contains "this" need to be the first line of our constructor always.
        System.out.println("Empty constructor called");
    }

    // But what if we want to set default for only a few values.
    public Account(String name, int phone) { // Some default values
        this(name, 98712367, 1_000, "noemail@no.com", phone);
        // This is how we set a few default values. Using "this" helps us to keep our code clean and is a really
        // good practice as this is allows us to use the same code to initialize every time.
        System.out.println("Acc. no. , balance and email set to default value");
    }

    // Now we know about constructors lets jump into the Main class and check it out.
}
