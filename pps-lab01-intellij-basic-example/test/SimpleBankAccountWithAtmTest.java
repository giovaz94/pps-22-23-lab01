import lab01.example.model.AccountHolder;
import lab01.example.model.BankAccountWithAtm;
import lab01.example.model.SimpleBankAccountWithAtm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SimpleBankAccountWithAtmTest {


    private AccountHolder accountHolder;
    private BankAccountWithAtm bankAccount;


    @BeforeEach
    void beforeEach() {
        this.accountHolder = new AccountHolder("Giovanni", "Antonioni", 2);
        this.bankAccount = new SimpleBankAccountWithAtm(this.accountHolder, 0);
    }

    @Test
    void testInitialBalance() {
        assertEquals(0, this.bankAccount.getBalance());
    }

    @Test
    void testDepositWithAtm() {
        this.bankAccount.depositWithAtm(this.accountHolder.getId(), 100);
        assertEquals(this.bankAccount.getBalance(), 99);
    }

    @Test
    void testWithdrawWithAtm() {
        this.bankAccount.deposit(this.accountHolder.getId(), 100);
        assertEquals(this.bankAccount.getBalance(), 100);

        this.bankAccount.withdrawWithAtm(this.accountHolder.getId(), 50);
        assertEquals(this.bankAccount.getBalance(), 49);
    }
}