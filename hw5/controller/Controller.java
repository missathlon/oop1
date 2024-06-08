package hw5.controller;

import hw5.model.*;
import hw5.service.DataService;
import hw5.view.StudentView;
import hw5.view.TeacherView;

import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();

    /**
     * Создание студента
     *
     * @param firstName  Имя
     * @param secondName Отчество
     * @param lastName   Фамилия
     */
    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    /**
     * Получение списка всех студентов
     */
    public void getAllStudent() {
        List<User> userList = dataService.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }

    /**
     * Создание учителя
     *
     * @param firstName  Имя
     * @param secondName Отчество
     * @param lastName   Фамилия
     */
    public void createTeacher(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    /**
     * Получение списка всех учителей
     */
    public void getAllTeacher() {
        List<User> userList = dataService.getAllTeacher();
        for (User user : userList) {
            teacherView.printOnConsole((Teacher) user);
        }
    }

    // ???????????????????????????????????????????????????????????????????????????????????????????????????????????????

    /**
     * Создание студенческой группы
     * 
     * @param studentList уже созданный список студентов
     * @param teacher     уже созданный учитель
     */
    public void createStudyGroup(List<Student> studentList, Teacher teacher) {
        if (studentList != null) {
            StudyGroup studyGroup = new StudyGroup(studentList, teacher);
            for (Student student : studentList) {
                studyGroup.addStudent(student);
            }
            studyGroup.addTeacher(teacher);
        }
    }

    public void getAllStudyGroup() {
        List<User> studentList = dataService.getAllStudent();
        for (User user : studentList) {
            studentView.printOnConsole((Student) user);
        }
        List<User> teacherList = dataService.getAllTeacher();
        for (User user : teacherList) {
            teacherView.printOnConsole((Teacher) user);
        }
    }
}