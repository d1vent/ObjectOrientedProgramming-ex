package Week4.keThua1;

public class Person {
    protected int age;
    protected String name;

    /**
     * Contructor 1.
     */
    public Person() {
    }

    /**
     * char of person.
     * @param age age
     * @param name name
     */
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * get age.
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * set age.
     * @param age age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * get name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * set name.
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }
}
