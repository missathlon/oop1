package hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student01 = new Student("Adam", "Adamovich", "Adamov", 1001);
        Student student02 = new Student("Kaan", "Klementovich", "Petrov", 1002);
        Student student03 = new Student("Yan", "Ivanovich", "Ivanov", 1003);
        Student student04 = new Student("Adam", "Klementovich", "Adamov", 1004);
        Student student05 = new Student("Kaan", "Adamovich", "Adamov", 1005);
        Student student06 = new Student("Adam", "Adamovich", "Ivanov", 1006);
        Student student07 = new Student("Adam", "Klementovich", "Ivanov", 1007);
        Student student08 = new Student("Yan", "Adamovich", "Ivanov", 1008);
        Student student09 = new Student("Adam", "Ivanovich", "Adamov", 1009);
        Student student10 = new Student("Adam", "Ivanovich", "Petrov", 1010);
        Student student11 = new Student("Yan", "Klementovich", "Adamov", 1011);
        Student student12 = new Student("Kaan", "Ivanovich", "Ivanov", 1012);
        Student student13 = new Student("Kaan", "Adamovich", "Ivanov", 1013);
        Student student14 = new Student("Yan", "Adamovich", "Petrov", 1014);
        Student student15 = new Student("Adam", "Ivanovich", "Ivanov", 1015);

        Curator curator01 = new Curator("Serge", "Sergeevich", "Sergeev", 9001);
        Curator curator02 = new Curator("Antony", "Antonovich", "Antonov", 9002);
        Curator curator03 = new Curator("Roman", "Romanovich", "Romanov", 9003);

        List<Student> studentList = new ArrayList<>();
        List<Student> group01 = new ArrayList<>();
        List<Student> group02 = new ArrayList<>();
        List<Student> group03 = new ArrayList<>();

        List<Curator> curatorList = new ArrayList<>();
        curatorList.add(curator01);
        curatorList.add(curator02);
        curatorList.add(curator03);

        group01.add(student01);
        group01.add(student04);
        group01.add(student07);
        group01.add(student10);
        group01.add(student13);
        group01.add(student15);
        StudentGroup studentGroup01 = new StudentGroup(group01, curatorList);

        group02.add(student02);
        group02.add(student05);
        group02.add(student08);
        group02.add(student11);
        StudentGroup studentGroup02 = new StudentGroup(group02, curatorList);

        group03.add(student03);
        group03.add(student06);
        group03.add(student09);
        group03.add(student12);
        group03.add(student14);
        StudentGroup studentGroup03 = new StudentGroup(group03, curatorList);

        List<StudentGroup> studentGroups = new ArrayList<>();
        studentGroups.add(studentGroup01); // 6 студентов, 3 куратора
        studentGroups.add(studentGroup02); // 4 студента, 3 куратора
        studentGroups.add(studentGroup03); // 5 студентов, 3 куратора

        studentGroups.sort(new StreamComparator());

        Stream stream = new Stream(studentGroups);
        for (StudentGroup studentGroup : stream) {
            System.out.println(studentGroup);
        }
    }
}
