

public class CheckingAccount extends Account {

    /**
     * Constructor 1.
     * @param accountNumber account number
     * @param balance balance
     */
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * override withdraw method.
     */
    @Override
    public void withdraw(double amount) {
        try {
            Transaction transaction = new Transaction(Transaction.TYPE_WITHDRAW_CHECKING,
                    amount, this.balance, this.balance - amount);
            super.doWithdrawing(amount);
            this.addTransaction(transaction);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * override deposit method.
     */
    @Override
    public void deposit(double amount) {
        try {
            Transaction transaction = new Transaction(Transaction.TYPE_DEPOSIT_CHECKING,
                    amount, this.balance, this.balance + amount);
            super.doDepositing(amount);
            this.addTransaction(transaction);
        } catch (InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
