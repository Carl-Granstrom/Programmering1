package tyreso.gymnasium._9_kontrollstrukturer_2_iteration._9_kontrollstrukturer_2_iteration_exercises;

public class Student {

    private final String name;
    private boolean awake;

    public Student(String name){
        this.name = name;
        this.awake = false;
    }

    public Student(String name, boolean awake){
        this.name = name;
        this.awake = awake;
    }

    public void wakeStudent() {
        if (this.awake == true){
            System.out.println("Student is already awake!");
        } else {
            this.awake = true;
            System.out.println("Waking student...");
        }

    }

    public String getName() {
        return name;
    }

    public boolean isAwake() {
        return awake;
    }

    public void setAwake(boolean awake) {
        this.awake = awake;
    }
}
