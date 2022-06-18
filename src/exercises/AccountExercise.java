package exercises;

public class AccountExercise {
    private String accName;
    private double accBal;
    private double amount;

    public void setAccName(String name) {
        this.accName = name;
        System.out.println( "This is the name of your account: "+ name);
    }

    public String getAccName() {
        return accName;
    }
    public double getAccBalance() {
        return accBal;
    }

    public void setAccBalance(double accBal) {
        this.accBal = accBal;
        System.out.println("This is your new account balance, after you created your account "+ accBal);
    }

    public void withdrawAmount(double amount) {
        accBal = accBal - amount;
        System.out.println(amount + " has been withdrawn from your account");
    }
}
