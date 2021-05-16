package za.ac.cput.nabeel.collection;

import java.util.ArrayList;
import java.util.Collection;

public class StudentService {

    private Collection<Student> collection;

    public StudentService(){

        collection = new ArrayList();
    }

    public StudentService(ArrayList <Student> collection){
        this.collection = collection;

    }

    public void add(Student student){
        collection.add(student);

    }

    public Student find(String name){
        for(Student student: collection){
            if (student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

    public void remove(Student id){
        collection.remove(id);
    }
}
