import lab01.example.model.AccountHolder;
import lab01.example.model.BankAccount;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseBankAccountTest<T extends BankAccount> {

    public static final int OTHER_USER_ID = 1000;
    private AccountHolder accountHolder;

    private T bankAccount;

    public AccountHolder getAccountHolder() {
        return Objects.requireNonNull(this.accountHolder);
    }

    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = Objects.requireNonNull(accountHolder);
    }

    public T getBankAccount() {
        return Objects.requireNonNull(this.bankAccount);
    }

    public void setBankAccount(T bankAccount) {
        this.bankAccount = Objects.requireNonNull(bankAccount);
    }

    @Test
    void testInitialBalance() {
        assertEquals(0, this.getBankAccount().getBalance());
    }

    @Test
    void testDeposit() {
        this.getBankAccount().deposit(this.getAccountHolder().getId(), 100);
        assertEquals(100, this.getBankAccount().getBalance());
    }

    @Test
    void testWrongDeposit() {
        this.getBankAccount().deposit(this.getAccountHolder().getId(), 100);
        this.getBankAccount().deposit(OTHER_USER_ID, 50);
        assertEquals(100, this.getBankAccount().getBalance());
    }

    @Test
    void testWithdraw() {
        this.getBankAccount().deposit(this.getAccountHolder().getId(), 100);
        this.getBankAccount().withdraw(this.getAccountHolder().getId(), 70);
        assertEquals(30, this.getBankAccount().getBalance());
    }


    @Test
    void testWrongWithdraw() {
        this.getBankAccount().deposit(this.getAccountHolder().getId(), 100);
        this.getBankAccount().withdraw(OTHER_USER_ID, 70);
        assertEquals(100, this.getBankAccount().getBalance());
    }


}
