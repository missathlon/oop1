package hw5.service;

import hw5.model.Student;
import hw5.model.Teacher;
import hw5.model.Type;
import hw5.model.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    private List<Student> studentList;
    private Teacher teacher;

    /**
     * Конструктор класса StudyGroupService
     * 
     * @param studentList список студентов
     * @param teacher     преподаватель
     */
    public StudyGroupService(List<Student> studentList, Teacher teacher) {
        this.studentList = new ArrayList<>();
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private int getFreeId(Type type) {
        int lastId = 1;
        boolean istStudent = Type.STUDENT == type;
        for (User user : studentList) {
            if (user instanceof Teacher && !istStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if (user instanceof Student && istStudent) {
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;
    }

    public void createStudyGroup(String firstName, String secondName, String lastName, Type type) {
        int id = getFreeId(type);
        if (type == type.STUDENT) {
            Student student = new Student(firstName, secondName, lastName, id);
            studentList.add(student);
        }
        if (type == type.TEACHER) {
            this.teacher = new Teacher(firstName, secondName, lastName, id);
        }
    }
}
