package hw5.model;

public class Student extends User {
    private int studentId;

    /**
     * Конструктор класса Студент (наследник класса пользователь, расширяющий его по
     * Id)
     * 
     * @param firstName  Имя
     * @param secondName Отчество
     * @param lastName   Фамилия
     */
    public Student(String firstName, String secondName, String lastName, int studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * Переопределение метода toString
     * 
     * @return Id, ФИО студента
     */
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }
}