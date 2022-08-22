package Task2;

public class Student {
    private String name;
    private String group;
    private final String studentId;

    public Student(String name, String group, String studentId) {

        this.name = name;
        this.group = group;
        this.studentId = studentId;

    }

    @Override
    public String toString() {
        return
                "-" + name +
                        "," + group +
                        "," + studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        return this.studentId.equals(((Student) o).studentId);
    }

    @Override
    public int hashCode() {
        return studentId.hashCode();
    }
}
