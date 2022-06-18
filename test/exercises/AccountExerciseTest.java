package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountExerciseTest {
    double accBal;
    String name;
    double bal;
    AccountExercise acc;

    @BeforeEach
    void setUp() {
        acc = new AccountExercise();
    }

    @Test
    void testThatIHaveAccountName(){
        name = "ACCOUNT BLESSING";
        acc.setAccName(name);
        String receive = acc.getAccName();
        assertEquals(name, receive);
    }

    @Test
    void testThatIHaveAccountBalance(){
        accBal = 0.00;
        acc.setAccBalance(accBal);
        bal = acc.getAccBalance();
        assertEquals(accBal, bal);
    }

    @Test
    void testThatAccHaveDepositedMoney(){
        acc.setAccBalance(5_000);
        double bal = acc.getAccBalance();
        assertEquals(bal, acc.getAccBalance());
    }

    @Test
    void testThatAccountCanWithdrawMoney(){
        acc.setAccBalance(5_000);
        double amount = 200.0;
        acc.withdrawAmount(amount);
        bal = acc.getAccBalance();
        assertEquals(bal, acc.getAccBalance());
        System.out.println("This is your new balance " + bal);
    }
}