package Week7.BankingSystem;

public class InsufficientFundsException extends BankException {
    /**
     * Print an exception for invalid amount.
     * @param amount amount
     */
    public InsufficientFundsException(double amount) {
        super("Số dư tài khoản không đủ $" + String.format("%.2f", amount) + " để thực hiện giao dịch");
    }

    /**
     * Constructor 1.
     * @param message message
     */
    public InsufficientFundsException(String message) {
        super(message);
    }
}
