

import java.io.InputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private List<Customer> customerList;

    /**
     * Method to read customer list from file.
     * @param inputStream input file
     */
    public void readCustomerList(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream);
        Customer customer = null;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] customerInfo = line.split(" ");
            if (customerInfo[0].charAt(0) >= '0' && customerInfo[0].charAt(0) <= '9') {
                if (customerInfo[1].equals(Account.CHECKING)) {
                    customer.addAccount(new CheckingAccount(Long.parseLong(customerInfo[0]),
                            Double.parseDouble(customerInfo[2])));
                } else if (customerInfo[1].equals(Account.SAVINGS)) {
                    customer.addAccount(new CheckingAccount(Long.parseLong(customerInfo[0]),
                            Double.parseDouble(customerInfo[2])));
                }
            } else {
                if (customer != null) {
                    customerList.add(customer);
                }
                String name = "";
                long id = 0;
                for (int i = 0; i < customerInfo.length; i++) {
                    if (customerInfo[i].charAt(0) > '9') {
                        if (!name.isEmpty()) {
                            name += " ";
                        }
                        name += customerInfo[i];
                    } else {
                        id = Long.parseLong(customerInfo[i]);
                    }
                }
                customer = new Customer(id, name);
            }
        }
        if (customer != null) {
            customerList.add(customer);
        }
    }

    /**
     * Method to get customer information by name order.
     * @return info by name
     */
    public String getCustomerInfoByNameOrder() {
        customerList.sort(Comparator.comparing(Customer::getFullName));
        String info = "";
        for (Customer customer : customerList) {
            info += customer.getCustomerInfo();
            info += "\n";
        }
        return info;
    }

    /**
     * Method to get customer information by id order.
     * @return info by id
     */
    public String getCustomerInfoByIdOrder() {
        customerList.sort(Comparator.comparingLong(Customer::getFullName));
        String info = "";
        for (Customer customer : customerList) {
            info += customer.getCustomerInfo();
            info += "\n";
        }
        return info;
    }

    /**
     * Method to get customer list.
     * @return customer list
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }
}
