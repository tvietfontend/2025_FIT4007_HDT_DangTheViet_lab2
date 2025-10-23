import java.io.Serializable;

public class Student implements Serializable {

    // (Good practice) serialVersionUID giúp đảm bảo phiên bản lớp nhất quán khi ghi/đọc file
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
