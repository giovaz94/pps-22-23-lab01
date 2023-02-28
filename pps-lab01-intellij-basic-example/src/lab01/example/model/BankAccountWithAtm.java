package lab01.example.model;

public interface BankAccountWithAtm extends BankAccount {

    void depositWithAtm(int id, double amount);

    void withdrawWithAtm(int id, double amount);
}
