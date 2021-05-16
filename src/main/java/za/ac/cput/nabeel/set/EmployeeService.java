package za.ac.cput.nabeel.set;

import java.util.HashSet;
import java.util.Set;

public class EmployeeService {


    private Set<Employee> set;

    public EmployeeService(){

        set= new HashSet<Employee>(){};
    }

    public EmployeeService(Set<Employee> set){

        this.set = set;

    }

    public void add(Employee employee){

        set.add(employee);

    }

    public Employee find(String name){

        for(Employee employee: set){
            if (employee.getName().equals(name)){
                return employee;
            }
        }
        return null;
    }

    public void remove(Employee employee){
        set.remove(employee);
    }
}
