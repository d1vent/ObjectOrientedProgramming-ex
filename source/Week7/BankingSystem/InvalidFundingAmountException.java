package Week7.BankingSystem;

public class InvalidFundingAmountException extends BankException {
    /**
     * Print an exception for invalid amount.
     * @param amount amount
     */
    public InvalidFundingAmountException(double amount) {
        super("Số tiền không hợp lệ: $" + String.format("%.2f", amount));
    }

    /**
     * Constructor 1.
     * @param message message
     */
    public InvalidFundingAmountException(String message) {
        super(message);
    }
}
