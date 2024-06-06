package hw4.view;

import hw4.controller.TeacherController;

public class Main {
    static TeacherController teacherController = new TeacherController();

    public static void main(String[] args) {
        teacherController.create("Adam", "Adamovich", "Adamov");
        teacherController.create("Kaan", "Klementovich", "Petrov");
        teacherController.create("Yan", "Ivanovich", "Ivanov");
        teacherController.create("Adam", "Klementovich", "Adamov");
        teacherController.create("Kaan", "Adamovich", "Adamov");
        teacherController.create("Adam", "Adamovich", "Ivanov");
        teacherController.create("Adam", "Klementovich", "Ivanov");
        teacherController.create("Yan", "Adamovich", "Ivanov");
        teacherController.create("Adam", "Ivanovich", "Adamov");
        teacherController.create("Adam", "Ivanovich", "Petrov");
        teacherController.create("Yan", "Klementovich", "Adamov");
        teacherController.create("Kaan", "Ivanovich", "Ivanov");

        teacherController.printAllTeacher();
    }
}
