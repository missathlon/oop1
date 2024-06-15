package hw6.became.service;

import hw6.became.data.Student;
import hw6.became.data.StudentGroup;
import hw6.became.data.Teacher;

import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;
    private final StudentSearchService searchService;
    private final StudentSortService sortService;

    public StudentGroupService(StudentSearchService searchService, Teacher teacher, List<Student> students,
            StudentSortService sortService) {
        this.sortService = sortService;
        this.studentGroup = new StudentGroup(teacher, students);
        this.searchService = searchService;
    }

    public StudentGroupService(StudentSortService sortService) {
        this.sortService = sortService;
        this.searchService = new StudentSearchService() {
            @Override
            public Student findStudent(String firstName, String secondName) {
                return null;
            }
        };

    }

    public StudentSearchService getSearchService() {
        return searchService;
    }

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        this.studentGroup = new StudentGroup(teacher, students);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public Student getStudentFromStudentGroup(String firstName, String secondName) {
        return searchService.findStudent(firstName, secondName);
    }

    public List<Student> getSortedStudentGroup() {
        return sortService.sortStudents();
    }

    public List<Student> getSortedByFIOStudentGroup() {
        return sortService.sortStudents();
    }
}
