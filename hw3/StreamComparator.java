package hw3;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup> {
    public int compare(StudentGroup o1, StudentGroup o2) {
        int groupCount1 = o1.getStudentList().size();
        int groupCount2 = o2.getStudentList().size();

        return Integer.compare(groupCount1, groupCount2);
    }
}