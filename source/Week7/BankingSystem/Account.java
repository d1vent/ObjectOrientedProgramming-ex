

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";

    public static final String SAVINGS = "SAVINGS";

    protected long accountNumber;

    protected double balance;

    protected List<Transaction> transactionList = new ArrayList<>();

    /**
     * Constructor 1.
     */
    public Account() {

    }

    /**
     * Constructor 2.
     * @param accountNumber account number
     * @param balance balance
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Get account number.
     * @return account number
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Get balance.
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Method to do depositing.
     * @param amount amount
     * @throws InvalidFundingAmountException exception
     */
    public void doDepositing(double amount) throws InvalidFundingAmountException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }
        this.balance += amount;
    }

    /**
     * Method to do withdrawing.
     * @param amount amount
     * @throws InsufficientFundsException exception
     */
    public void doWithdrawing(double amount) throws BankException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount);
        } else if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }
        this.balance -= amount;
    }

    /**
     * an abstract withdraw.
     * @param amount amount
     */
    public abstract void withdraw(double amount);

    /**
     * an abstract deposit.
     * @param amount amount
     */
    public abstract void deposit(double amount);

    /**
     * Get the history of transaction list.
     * @return history
     */
    public String getTransactionHistory() {
        String history = "Lịch sử giao dịch của tài khoản " + this.accountNumber + ":";
        for (Transaction transaction : transactionList) {
            history += "\n" + "- " + transaction.getTransactionSummary();
        }
        return history;
    }

    /**
     * Add a transaction to list.
     * @param transaction transaction
     */
    public void addTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    /**
     * Check if account numbers are equal or not.
     * @param obj object
     * @return equal or not
     */
    @Override
    public boolean equals(Object obj) {
        Account account = (Account) obj;
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return this.accountNumber == account.accountNumber;
    }
}
