package hw6.became.service;

import hw6.became.data.Student;
import hw6.became.data.StudentGroup;
import hw6.became.data.UserComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSort extends StudentGroupQueryService implements StudentSortService {
    private final StudentGroup studentGroup;

    public StudentSort(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public List<Student> sortStudents() {
        return null;
    }

    public List<Student> getSortedStudentGroup() {
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }

    public List<Student> getSortedByFIOStudentGroup() {
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }

    @Override
    Student findStudent(String firstName, String secondName) {
        return null;
    }

    @Override
    List<Student> sortStudents(StudentGroup studentGroup) {
        return null;
    }
}
