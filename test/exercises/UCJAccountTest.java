package exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UCJAccountTest {

    UCJAccount ucjAccount;

    @BeforeEach
    void setUp(){
        ucjAccount = new UCJAccount("UCJ", 00.0);
    }

    @Test
    void testThatAccountHasName(){
        assertEquals("UCJ", ucjAccount.getAccName());
    }

    @Test
    public void testThatAccountDeposit(){
        ucjAccount.deposit(50_000.0);
        assertEquals(50_000.0, ucjAccount.getBalance());
    }

    @Test
    void testThatAccountCanMakeWithdrawal(){
        ucjAccount.deposit(25_000.0);
        ucjAccount.withdraw(3_000.0);
        assertEquals(22_000.0, ucjAccount.getBalance());
    }

    @Test
    void testThatAccountDoesNotWithdrawMoreThanBalance(){
        ucjAccount.deposit(5000.0);
        ucjAccount.withdraw(5000.0);
        assertEquals(0.0, ucjAccount.getBalance());
    }
}
