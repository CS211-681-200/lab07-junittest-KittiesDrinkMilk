package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentListTest {
    @Test
    void testAddNewStudent() {
        StudentList list = new StudentList();
        list.addNewStudent("671000","test");
        assertEquals(1, list.getStudents().size());

    }
}
