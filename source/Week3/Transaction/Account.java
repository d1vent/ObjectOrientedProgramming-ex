package Week3.Transaction;

import java.util.ArrayList;

public class Account {
    private double balance;
    private final ArrayList<Transaction> transitionList;

    /**
     * Contructor 1.
     */
    Account() {
        this.balance = 0;
        this.transitionList = new ArrayList<Transaction>();
    }

    /**
     * Contructor 2.
     * @param balance balance
     */
    Account(double balance) {
        this.balance = balance;
        this.transitionList = new ArrayList<Transaction>();
    }

    /**
     * add amount.
     * @param amount am
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        balance += amount;
        transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
    }

    /**
     * withdraw an am.
     * @param amount am
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
            transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
        }
    }

    /**
     * add transaction to the acc.
     * @param amount am
     * @param operation op
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * print bill.
     */
    public void printTransaction() {
        int i = 1;
        for (Transaction transaction : transitionList) {
            if (transaction.getOperation().equals(Transaction.DEPOSIT)) {
                System.out.printf("Giao dich %d: Nap tien $%.2f. So du luc nay: $%.2f.\n",
                        i, transaction.getAmount(), transaction.getBalance());
            } else {
                System.out.printf("Giao dich %d: Rut tien $%.2f. So du luc nay: $%.2f.\n",
                        i, transaction.getAmount(), transaction.getBalance());
            }
            i++;
        }
    }
}
