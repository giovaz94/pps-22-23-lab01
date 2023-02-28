import lab01.example.model.AccountHolder;
import lab01.example.model.BankAccountWithAtm;
import lab01.example.model.SimpleBankAccount;
import lab01.example.model.SimpleBankAccountWithAtm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SimpleBankAccountWithAtmTest extends BaseBankAccountTest<BankAccountWithAtm> {

    @BeforeEach
    void beforeEach() {
        this.setAccountHolder(new AccountHolder("Giovanni", "Antonioni", 2));
        this.setBankAccount(new SimpleBankAccountWithAtm(this.getAccountHolder(), 0));
    }

    @Test
    void testDepositWithAtm() {
        this.getBankAccount().depositWithAtm(this.getAccountHolder().getId(), 100);
        assertEquals(this.getBankAccount().getBalance(), 99);
    }

    @Test
    void testWithdrawWithAtm() {
        this.getBankAccount().deposit(this.getAccountHolder().getId(), 100);
        assertEquals(this.getBankAccount().getBalance(), 100);

        this.getBankAccount().withdrawWithAtm(this.getAccountHolder().getId(), 50);
        assertEquals(this.getBankAccount().getBalance(), 49);
    }
}