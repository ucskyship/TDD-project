package exercises;

public class UCJAccount {
    String accName;
    double amount;
    double balance;

    public UCJAccount(String accName, double amount){
        this.accName = accName;
        this.amount = amount;
    }

    public String getAccName() {
        return accName;
    }

    public void deposit(double amount) {
        this.balance = balance + amount;
    }

    public double getBalance() {
        System.out.println(balance);
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance){
            System.out.println("Withdrawal amount exceeded account balance.");
        } else {
            this.balance = balance - amount;
        }
    }
}
