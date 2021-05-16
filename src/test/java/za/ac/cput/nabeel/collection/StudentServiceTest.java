package za.ac.cput.nabeel.collection;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentServiceTest {

    @Test
    public void testAdd() {
        ArrayList<Student> collection = new ArrayList<>();
        StudentService service = new StudentService(collection);
        Student std = new Student();
        std.setName("samuel");
        std.setAge(42);
        service.add(std);
        assertTrue(collection.contains(std));
    }

    @Test
    public void testFind() {
        ArrayList<Student> collection = new ArrayList<>();
        StudentService service = new StudentService(collection);
        Student std = new Student();
        std.setName("jessica");
        std.setAge(43);
        service.add(std);
        Student newStudent = service.find("jessica");
        assertEquals(newStudent,std);
        System.out.println(std.getName());
    }

    @Test
    public void testRemove() {

        ArrayList<Student> collection = new ArrayList<>();
        StudentService service = new StudentService(collection);
        Student std = new Student();
        std.setName("coheed");
        std.setAge(21);
        service.add(std);

        Student std2 = new Student();
        std2.setName("cambria");
        std2.setAge(31);
        service.add(std2);

        Student std3 = new Student();
        std3.setName("pogo");
        std3.setAge(41);
        service.add(std3);

        service.remove(std2);
        assertFalse(collection.contains(std2));
        System.out.println("contains "+std.getName() + " > "+ collection.contains(std));
        System.out.println("contains " +std2.getName() + " > "+ collection.contains(std2));
        System.out.println("contains " +std3.getName() + " > "+ collection.contains(std3));
}
}