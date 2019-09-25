package tyreso.gymnasium._11_collections;

/**
 * A class representing a letter grade in the Swedish school system.
 *
 * This is a poor implementation. Ideally the grade ought to be represented as a number instead of a letter.
 */
public class Grade {

    private final String subject;       //final because you never want to change what subject a grade belongs to
    private String preliminaryGrade;    //holds the preliminary grade
    private String grade;               //holds the final grade


    //constructor
    Grade(String subject, String gradeLetter){
        this.subject = subject;
        this.preliminaryGrade = gradeLetter;
        this.grade = "";
    }

    //Finalizes the grade by moving the letter representing the grade from preliminaryGrade to grade
    public void finalizeGrade(){
        if (this.grade.equals("")){             //if grade is empty
            this.grade = this.preliminaryGrade; //set grade to be equal to preliminaryGrade
            this.preliminaryGrade = "";         //set preliminaryGrade to be equal to the empty string("").
        }   else {
            throw new IllegalStateException("This grade has already been finalized!");
        }
    }

    //***************Getters and Setters*******************//

    //return the value of the preliminary grade
    public String getPreliminaryGrade() {
        return preliminaryGrade;
    }

    //change the value of the preliminary grade
    public void setPreliminaryGrade(String preliminaryGrade) {
        this.preliminaryGrade = preliminaryGrade;
    }

    //return the grade
    public String getGrade() {
        return grade;
    }
}
