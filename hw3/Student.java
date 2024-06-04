package hw3;

public class Student extends User {
    private int studentId;

    public Student(String lastName, String firstName, String secondName, int studentId) {
        super(lastName, firstName, secondName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student: " +
                "Name: " + super.getFirstName() +
                ", Patronymic: " + super.getSecondName() +
                ", Surname: " + super.getLastName() +
                ", id: " + studentId;
    }
}