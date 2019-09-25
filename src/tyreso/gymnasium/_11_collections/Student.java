package tyreso.gymnasium._11_collections;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private double gradeaverage;
    private List<Grade> grades;

    Student(String name, int age){
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<Grade>(20);
    }

    public void addGrade(String subject, String gradeLetter){
        grades.add(new Grade(subject, gradeLetter));
    }

    //TODO method for deleting grades

    //Finalize a grade according to index
    public void finalizeGrade(int index){
        grades.get(index).finalizeGrade();
    }

    //Finalize all grades, using an enhanced for-loop
    public void finalizeAllGrades(){
        for (Grade g : grades){
            g.finalizeGrade();
        }
    }

    //***************Getters and Setters*******************//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
