package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student s;
    @BeforeEach
    void init() {
        s = new Student("6733333333", "test");
    }

    @Test
    void testAddScore() {
        Student s = new Student("6411111111", "test");
        s.addScore(49);
        assertEquals(49, s.getScore());
    }
    @Test
    @DisplayName("Calculate Grade")
    void testCalculateGrade(){
        Student s = new Student("6222222222", "test");
        s.addScore(60);
        assertEquals("C", s.grade());
    }
    @Test
    @DisplayName("isId")
    void testisId() {
        Student s = new Student("6333333333", "test");
        assertEquals(true, s.isId("6333333333"));
    }
    @Test
    void testChangeName() {
        Student s = new Student("674444444444", "test");
        s.changeName("NStudent ");
        assertEquals("NStudent", s.getName());
    }
    @Test
    void testToString() {
        Student s = new Student("675555555555", "test");
        assertEquals("{id: '675555555555\', name: 'test\', score: 0.0}", s.toString());
    }
    @Test
    void testisNameContains() {
        Student s = new Student("6766666666", "test");
        assertEquals(true, s.isNameContains(s.getName()));
    }
}