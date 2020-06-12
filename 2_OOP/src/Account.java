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
    public void withdraw(double money_out){
        if (money_out > this.balance){
            System.out.println("Insufficient funds. Total balance = "+this.balance);
        }else {
            this.balance -= money_out;
            System.out.println("Money withdrawn. Total balance = "+this.balance);
        }
    }

    public void deposit(double money_in){
        this.balance += money_in;
        System.out.println("Money added. Total balance = "+this.balance);
    }

    // Now lets jump back into our Main class.


    // Right by now you have realised that setting parameters is a bit too cumbersome the way we do it. So lets
    // see how we initialize our field variables using constructors.
    // So a constructor is already created by default when we initialize our class with the keyword "new".

    // Let us create a constructor. Now a constructor is special as it does not have a return type (not even
    // void). The name of our constructor should be same as that of the class.

//    public Account(String name,int accountNumber,double balance,String email,int phone){
//        System.out.println("Our constructor has been created.");
//        this.name=name;
//        this.accountNumber=accountNumber;
//        this.balance = balance;
//        this.email = email;
//        this.phone = phone;
//    }
//
//    // Not only that, but Java also allows us to overload constructors.

}
