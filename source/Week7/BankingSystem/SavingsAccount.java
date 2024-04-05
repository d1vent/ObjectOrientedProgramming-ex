package Week7.BankingSystem;

public class SavingsAccount extends Account {

    /**
     * Constructor 1.
     * @param accountNumber account number
     * @param balance balance
     */
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * override withdraw savings method.
     */
    @Override
    public void withdraw(double amount) {
        try {
            if (amount > 1000) {
                throw new InvalidFundingAmountException(amount);
            }
            if (amount < 5000) {
                throw new InsufficientFundsException(amount);
            }
            super.doWithdrawing(amount);
            Transaction transaction = new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS,
                    amount, getBalance(), getBalance() + amount);
            addTransaction(transaction);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * override deposit savings method.
     */
    @Override
    public void deposit(double amount) {
        try {
            super.doDepositing(amount);
            Transaction transaction = new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS,
                    amount, getBalance(), getBalance() - amount);
            addTransaction(transaction);
        } catch (InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
