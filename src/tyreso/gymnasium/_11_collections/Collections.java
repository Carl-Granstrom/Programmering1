package tyreso.gymnasium._11_collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public void main(String[] args){
        List<Student> studentList = new ArrayList<Student>();

        Student student1 = new Student("Carl", 37);
        studentList.add(student1);
        Student student2 = new Student("Sven", 15);
        studentList.add(student2);
        Student student3 = new Student("Klara", 19);
        studentList.add(student3);

        student1.addGrade("Math", "F");
        student1.addGrade("English", "D");
        student1.addGrade("Sports", "B");
    }



}
