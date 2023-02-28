import lab01.example.model.AccountHolder;
import lab01.example.model.BankAccount;

import lab01.example.model.SimpleBankAccount;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the SimpleBankAccount implementation
 */
class SimpleBankAccountTest extends BaseBankAccountTest<BankAccount> {


    @BeforeEach
    void beforeEach(){
        this.setAccountHolder(new AccountHolder("Mario", "Rossi", 1));
        this.setBankAccount(new SimpleBankAccount(this.getAccountHolder(), 0));
    }

}
