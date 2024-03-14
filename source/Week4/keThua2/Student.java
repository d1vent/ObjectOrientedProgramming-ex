package Week4.keThua2;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Constructor 1.
     * @param name name
     * @param address address
     * @param program program
     * @param year year
     * @param fee fee
     */

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * Getter for program.
     * @return program
     */

    public String getProgram() {
        return program;
    }

    /**
     * Setter for program.
     * @param program program
     */

    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Getter for year.
     * @return year
     */

    public int getYear() {
        return year;
    }

    /**
     * Setter for year.
     * @param year year
     */

    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Getter for fee.
     * @return fee
     */

    public double getFee() {
        return fee;
    }

    /**
     * Setter for fee.
     * @param fee fee
     */

    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * Overrides the toString method.
     */

    @Override
    public String toString() {
        return "Student[Person[name=" + getName() + ",address=" + getAddress()
                + "],program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }
}
