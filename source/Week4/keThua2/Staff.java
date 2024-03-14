package Week4.keThua2;

public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Constructor 1.
     * @param name name
     * @param address address
     * @param school school
     * @param pay pay
     */

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * Get forte the school.
     * @return school
     */

    public String getSchool() {
        return school;
    }

    /**
     * Set the school.
     * @param school school
     */

    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Get the pay.
     * @return pay
     */

    public double getPay() {
        return pay;
    }

    /**
     * Set the pay.
     * @param pay pay
     */

    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Overrides the toString method.
     */

    @Override
    public String toString() {
        return "Staff[Person[name=" + getName() + ",address=" + getAddress()
                + "],school=" + school + ",pay=" + pay + "]";
    }

}