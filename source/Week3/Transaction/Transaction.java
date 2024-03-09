package Week3.Transaction;

/**
 * set transaction.
 */
public class Transaction {
    private String operation;
    private double amount;
    private double balance;
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * Contructor 1.
     *
     * @param operation op
     * @param amount am
     * @param balance bl
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * Getter for the operation.
     * @param operation op
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Getter for the op.
     * @return the op
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Setter for the amount.
     * @param amount amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Getter for the amount.
     * @return amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Setter for the balance.
     * @param balance bl
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Getter for the balance.
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }
}
