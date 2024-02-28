package Week2.StudentManagement;

public class StudentManagement {

    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100)

    private Student[] students = new Student[100];
    private int totalStudent = 0;

    public StudentManagement() {
    }

    /**
     * check same student.
     * @param s1 sv1
     * @param s2 sv2
     * @return kiem tra 2 sv co cung 1 lop khong
     */
    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * them sv moi vao mang.
     *
     * @param newStudent sv moi
     */
    public void addStudent(Student newStudent) {
        // TODO:
        students[totalStudent] = new Student(newStudent);
        totalStudent++;
    }

    /**
     * sv sap xep theo thu tu in vao.
     * @return chuoi danh sach sinh vien theo lop
     */
    public String studentsByGroup() {
        // TODO:
        if (students[0] == null) {
            return "";
        }

        // DFS
        int n = totalStudent;
        boolean[] visited = new boolean[100];
        String result = "";

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            String grp = students[i].getGroup();
            result = result + grp + "\n";
            for (int j = i; j < n; j++) {
                if (students[j].getGroup().equals(grp)) {
                    visited[j] = true;
                    result = result + students[j].getInfo() + "\n";
                }
            }
        }
        return result;
    }

    /**
     * xoa sinh vien.
     * @param id id cua sv can xoa
     */
    public void removeStudent(String id) {
        // TODO:
        int flag = -1;
        for (int i = 0; i < totalStudent; i++) {
            if (students[i].getId().equals(id)) {
                flag = i;
                break;
            }
        }

        if (flag == -1) {
            System.err.println("Not found");
            return;
        }

        for (int i = flag; i < totalStudent - 1; i++) {
            students[i] = students[i + 1];
        }
        totalStudent--;
    }

    /**
     * ham main.
     * @param args run
     */
    public static void main(String[] args) {
        // TODO:
        StudentManagement studentManagement = new StudentManagement();
        Student s1 = new Student("Nguyen Van An", "17020001", "K62CC", "17020001@vnu.edu.vn");
        Student s2 = new Student("Nguyen Van B", "17020002", "K62CC", "17020002@vnu.edu.vn");
        Student s3 = new Student("Nguyen Van C", "17020003", "K62CB", "17020003@vnu.edu.vn");
        Student s4 = new Student("Nguyen Van D", "17020004", "K62CB", "17020004@vnu.edu.vn");
        studentManagement.addStudent(s1);
        studentManagement.addStudent(s2);
        studentManagement.addStudent(s3);
        studentManagement.addStudent(s4);
        System.out.println(studentManagement.studentsByGroup());
    }
}
