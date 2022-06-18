package exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void accountCanBeCreatedTest() {
        //given I have created an account
        Account nepaAccount = new Account();
        //when I check my balance
        int balance = nepaAccount.getBalance();
        //confirm that my balance is zero
        assertEquals(0, balance);

    }

    @Test
    public void depositMoneyTest() {
        //given I have an account
        Account boyoAccount = new Account();
        // when I deposit money
        boyoAccount.deposit(1_500);
        //check that my balance has changed
        assertEquals(1_500, boyoAccount.getBalance());

    }

    @Test
    public void depositTwiceTest() {
        Account uselessAccount = new Account();
        uselessAccount.deposit(1_500);
        uselessAccount.deposit(2_000);
        assertEquals(3_500, uselessAccount.getBalance());


    }

    @Test
    @DisplayName("Deposit negative amount should not change balance test")
    public void depositNegativeAmount() {
        // given that I have an account
        Account jonneryAccount = new Account();
        // if i deposit negative amount
        jonneryAccount.deposit(-3_000);
        // show that my account has NOT changed
        assertEquals(0, jonneryAccount.getBalance());
    }

    @Test
    public void withdrawMoneyTest() {
        //given I have an account
        Account akaAccount = new Account();
        // when I deposit
        akaAccount.deposit(7_000);
        //when I withdraw
        akaAccount.withdraw(200);
        //check that my balance has changed
        assertEquals(6_800, akaAccount.getBalance());

    }

    @Test
    @DisplayName("Withdraw excess amount from the available balance")
    public void excessWithdrawal() {
        //given that I have an account
        Account lojayAccount = new Account();
        // when I deposit
        lojayAccount.deposit(5_000);
        // when I withdraw excess
        lojayAccount.withdraw(9_000);
        // check that my balance has NOT changed
        assertEquals(5_000, lojayAccount.getBalance());

    }

    @Test
    @DisplayName("Withdraw negative amount")
    public void negativeWithdrawal() {
        //given that I have an account
        Account kojoAccount = new Account();
        //when I deposit money
        kojoAccount.deposit(6_000);
        //when I withdraw negative amount
        kojoAccount.withdraw(-1_000);
        //check that my balance has NOT changed
        assertEquals(6_000, kojoAccount.getBalance());

    }

    @Test
    public void withdrawAllMoneyTest() {
        //given I have an account
        Account mallamAccount = new Account();
        // when I deposit
        mallamAccount.deposit(7_000);
        //when I withdraw everything
        mallamAccount.withdraw(7_000);
        //check that my balance has changed
        assertEquals(0, mallamAccount.getBalance());
    }
}
