package lab01.example.model;

public class SimpleBankAccountWithAtm extends SimpleBankAccount implements BankAccountWithAtm {

    public static final int TRANSACTION_FEE = 1;

    public SimpleBankAccountWithAtm(AccountHolder holder, double balance) {
        super(holder, balance);
    }

    @Override
    public void depositWithAtm(int id, double amount) {
        this.deposit(id, amount - TRANSACTION_FEE);
    }

    @Override
    public void withdrawWithAtm(int id, double amount) {
        this.withdraw(id, amount  + TRANSACTION_FEE);
    }

}
