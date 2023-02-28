package lab01.example.model;

public interface BankAccountWithAtm extends BankAccount {

    /**
     * Allows the deposit of an amount on the account using an ATM, if the given userID corresponds to the register holder ID
     * of the bank account. This ID acts like an "identification token" .
     * The total amount to be deposited is taxed of a transaction fee.
     *
     * @param id the id of the user that wants do the deposit
     * @param amount the amount of the deposit
     */
    void depositWithAtm(int id, double amount);

    /**
     * Allows the withdrawal of an amount from the account using an ATM, if the given userID corresponds to the register holder ID
     * of the bank account. This ID acts like an "identification token" .
     * The total amount to be deposited is taxed of a transaction fee.
     *
     * @param id the id of the user that wants do the withdrawal
     * @param amount the amount of the withdrawal
     */
    void withdrawWithAtm(int id, double amount);
}
