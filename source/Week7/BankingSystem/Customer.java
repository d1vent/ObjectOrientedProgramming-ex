

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;

    private String fullName;

    private List<Account> accountList = new ArrayList<>();

    /**
     * Constructor 1.
     */
    public Customer() {

    }

    /**
     * Constructor 2.
     * @param idNumber id number
     * @param fullName full name
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * Method to get customer information.
     * @return customer information
     */
    public String getCustomerInfo() {
        return "Số CMND: " + idNumber + ". Họ tên: " + fullName + ".";
    }

    /**
     * Method to add an account to list.
     * @param account account
     */
    public void addAccount(Account account) {
        for (Account acc : accountList) {
            if (account.equals(acc)) {
                return;
            }
        }
        accountList.add(account);
    }

    /**
     * Method to remove an account from list.
     * @param account account
     */
    public void removeAccount(Account account) {
        for (Account acc : accountList) {
            if (account.equals(acc)) {
                accountList.remove(acc);
                break;
            }
        }
    }

    /**
     * Get the id number.
     * @return id number
     */
    public long getIdNumber() {
        return idNumber;
    }

    /**
     * Set the id number.
     * @param idNumber id number
     */
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Get full name.
     * @return name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Set full name.
     * @param fullName name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Get list of account.
     * @return list
     */
    public List<Account> getAccountList() {
        return accountList;
    }
}
