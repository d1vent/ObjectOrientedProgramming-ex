package Week4.keThua1;

public class Student extends Person {
    private String id; //MSSV

    /**
     * Contructor 2.
     * @param age age
     * @param name name
     * @param id id
     */
    public Student(int age, String name, String id) {
        super(age, name);
        this.id = id;
    }

    /**
     * get id.
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * set id.
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }
}
