package hw6.became.service;

import hw6.became.data.Student;

public interface StudentSearchService {

    Student findStudent(String firstName, String secondName);
}
