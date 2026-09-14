public class StudentTester {
    public static void main(String[] args) {
        Student John = new Student("John");
        Student Jane = new Student("Jane", 11);
        Student Bob = new Student("Bob", 12);
        Student Jeff = new Student("Jeff", 9);

        System.out.println(John.toString());
        System.out.println(Jane.toString());
        System.out.println(Bob.toString());
        System.out.println(Jeff.toString());

        John.setName("Timmy");
        Bob.setGrade(10);

        Jane.equals(Jeff);
    }
}
