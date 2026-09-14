public class Student {
    private String name;
    private String id;
    private int grade;

    public Student(String newName) {
        name = newName;
        grade = 10;
        id = generateId();
    }

    public Student(String newName, int newGrade) {
        name = newName;
        grade = newGrade;
        id = generateId();
    }

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }
    public String getId() {
        return id;
    }
    public void setId(String newId) {
        id = newId;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int newGrade) {
        grade = newGrade;
    }

    public String toString() {
        return "Student's name: " + name + ", grade: " + grade + ", id: " + id + ".";
    }
    public boolean equals(Student other) {
        if (grade == other.grade && other.name.equals(name)
            && other.id.equals(id)) {
            return true;
        }
        else {
            return false;
        }
    }
    public String generateId() {
        int first = (int) (Math.random() * 6) + 100;
        int second = (int) (Math.random() * 9000) + 1000;
        return first + "-" + second;
    }
}
