package za.ac.cput.nabeel.set;

public class Employee {

    private String name;
    private int age;

    public Employee(){}

    public Employee(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double price) {
        this.age = age;
    }
}
