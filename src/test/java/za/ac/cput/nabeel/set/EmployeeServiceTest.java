package za.ac.cput.nabeel.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;


import static org.junit.Assert.*;

public class EmployeeServiceTest {

    @Test
    public void testAddToSet() {


        Set<Employee> set = new HashSet<>();
        EmployeeService service = new EmployeeService(set);
        Employee emp = new Employee();
        emp.setName("Micheal");
        service.add(emp);
        assertTrue(set.contains(emp));
    }

    @Test
    public void testFindInSet() {


        Set<Employee> set = new HashSet<>();
        EmployeeService service = new EmployeeService(set);
        Employee emp = new Employee();
        emp.setName("Micheal");
        emp.setAge(21);
        service.add(emp);
        Employee newEmp = service.find("Micheal");
        assertEquals(newEmp,emp);
        System.out.println(emp.getName());
    }

    @Test
    public void testRemoveFromSet() {

        Set<Employee> set = new HashSet<>();
        EmployeeService service = new EmployeeService(set);
        Employee emp = new Employee();
        emp.setName("micheal");
        emp.setAge(21);
        service.add(emp);

        Employee emp2 = new Employee();
        emp2.setName("mark");
        emp2.setAge(52);
        service.add(emp2);

        Employee emp3 = new Employee();
        emp3.setName("anthony");
        emp3.setAge(43);
        service.add(emp3);

        service.remove(emp);
        assertFalse(set.contains(emp));
        System.out.println("contains "+emp.getName() + " > "+ set.contains(emp));
        System.out.println("contains " +emp2.getName() + " > "+ set.contains(emp2));
        System.out.println("contains " +emp3.getName() + " > "+ set.contains(emp3));
    }
}