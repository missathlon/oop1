package hw5.model;

public class Teacher extends User {
    private int teacherId;

    /**
     * Конструктор класса Учитель (наследник класса пользователь, расширяющий его по
     * Id)
     * 
     * @param firstName  Имя
     * @param secondName Отчество
     * @param lastName   Фамилия
     */
    public Teacher(String firstName, String secondName, String lastName, int teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * Переопределение метода toString
     * 
     * @return Id, ФИО учителя
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }
}
