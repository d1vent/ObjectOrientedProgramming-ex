package Week2.StudentManagement;

public class Student {

    // TODO: khai bao cac thuoc tinh cho Student

    // TODO: khai bao cac phuong thuc getter, setter cho Student

    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Constructor 1.
     */
    Student() {
        // TODO:
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2.
     * @param name  ten sinh vien
     * @param id    ma sinh vien
     * @param email mail sv
     */
    Student(String name, String id, String email) {
        // TODO:
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     * Constructor 3.
     * @param s thuoc tinh lop Student
     */
    Student(Student s) {
        // TODO:
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    /**
     * Constructor 4.
     * @param name  ten sv
     * @param id    msv
     * @param group lop hoc
     * @param email email sv
     */
    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    String getInfo() {
        // TODO:
        return String.format("%s - %s - %s - %s", getName(), getId(), getGroup(), getEmail());
    }
}