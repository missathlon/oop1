package hw3;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup implements Comparable<StudentGroup> {
    public StudentGroup(List<Student> studentList, List<Curator> curatorList) {
        this.studentList = studentList;
        this.curatorList = curatorList;
    }

    private List<Student> studentList = new ArrayList<>();
    private List<Curator> curatorList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;

    }

    public List<Curator> getCuratorList() {
        return curatorList;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public void addCurator(Curator curator) {
        this.curatorList.add(curator);
    }

    @Override
    public String toString() {
        return "Student group: " +
                studentList +
                curatorList;
    }

    @Override
    public int compareTo(StudentGroup o) {
        return Integer.compare(this.studentList.size(), o.getStudentList().size());
    }
}