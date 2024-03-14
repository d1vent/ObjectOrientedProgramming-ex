package Week4.keThua2;

public class Person {
    private String name;
    private String address;

    /**
     * Constructor 1.
     */

    public Person() {
        this.name = "";
        this.address = "";
    }

    /**
     * Constructor 2.
     * @param name name
     * @param address address
     */

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Get name.
     * @return name
     */

    public String getName() {
        return name;
    }

    /**
     * Get the address.
     * @return address
     */

    public String getAddress() {
        return address;
    }

    /**
     * Set the address.
     * @param address address
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * override toString.
     */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}