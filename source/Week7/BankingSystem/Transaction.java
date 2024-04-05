package Week7.BankingSystem;

public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 1;

    public static final int TYPE_WITHDRAW_CHECKING = 2;

    public static final int TYPE_DEPOSIT_SAVINGS = 3;

    public static final int TYPE_WITHDRAW_SAVINGS = 4;

    private int type;

    private double amount;

    private double initialBalance;

    private double finalBalance;

    /**
     * Constructor 1.
     * @param type type
     * @param amount amount
     * @param initialBalance balance before doing transaction
     * @param finalBalance balance after doing transaction
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * Method to get type of transaction.
     * @param type type of transaction
     * @return type
     */
    private String getTransactionTypeString(int type) {
        switch (type) {
            case TYPE_DEPOSIT_CHECKING -> {
                return "Nạp tiền vãng lai";
            }
            case TYPE_WITHDRAW_CHECKING -> {
                return "Rút tiền vãng lai";
            }
            case TYPE_DEPOSIT_SAVINGS -> {
                return "Nạp tiền tiết kiệm";
            }
            case TYPE_WITHDRAW_SAVINGS -> {
                return "Rút tiền tiết kiệm";
            }
            default -> {
                return "Invalid type of transaction";
            }
        }
    }

    /**
     * Get the information of a summary transaction.
     * @return transaction summary
     */
    public String getTransactionSummary() {
        return  "Kiểu giao dịch: "
                + getTransactionTypeString(type) + ". Số dư ban đầu: $"
                + String.format("%.2f", initialBalance) + ". Số tiền: $"
                + String.format("%.3f", amount) + ". Số dư cuối: $"
                + String.format("%.2f", finalBalance) + ".";
    }
}
