package tyreso.gymnasium._8_more_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * A Mage to be used for a game.
 *
 * @author Carl Granström
 */
public class Mage {

    private UUID id = UUID.randomUUID();
    private double armor = 3;
    private String name;
    private String className;
    private String sex;
    private long health;
    //add variable to hold the health regen
    private long mana;
    //add variable to hold the mana regen
    private List<Spell> spells;     //We will have a deeper look at this for next class
    private Spell fireball;

    /**
     * Constructors need to be public if you want to be able to create the object at all.
     *
     * There is a pattern called "Singleton" where you use a private constructor to make sure that only one object from
     * a certain class is created, this pattern uses a private constructor. Private constructors are also used in
     * "inner classes", which are classes defined inside another class. There are some use cases for that, but it's
     * well beyond the scope of this course.
     *
     * @param name the name you want the mage to have.
     */
    public Mage(String name){
        this.name = name;                       //Set the name of the new mage to the supplied String parameter "name"
        this.className = "Mage";                //All mages are of the class Mage
        this.sex = "F";                         //New mages are created as female by default
        this.health = 100;                      //New mages are created with 100 health
        this.mana = 100;                        //New mages are created with 100 mana
        this.spells = new ArrayList<Spell>();   //For now, an empty list of spells.
        this.fireball = new Spell();            //All spells are fireballs for now.
    }

    //Methods
    //Methods can be private if they should only be used by the class itself, like when you want to divide a complex
    //thing you want to do into several steps.

    /**
     * Cast a fireball spell.
     * @return the damage dealt by the fireball before mitigation.
     */
    public double castFireball(){
        this.mana -= fireball.manaCost;
        return fireball.hit();
    }

    /**
     * Cast a spell.
     * @param spellNumber the index number of the spell
     * @return the damage dealt by the spell before mitigation.
     */
    public double castSpell(int spellNumber) {
        //assign to local variable "spell" the spell object store at the position specified by spellNumber
        Spell spell = spells.get(spellNumber);
        //subtract the manacost of the spell stored in local variable "spell" from the manapool of this Mage
        this.mana -= spell.manaCost;
        //call the hit()-method of the spell stored in the local variable "spell"
        return spell.hit();
    }

    /**
     * This method handles how the Mage takes damage. Depending on implementation you might need to add more variables
     * as well.
     */
    public void takeDamage(double damage){
        damage -= this.armor;
        this.health -= damage;
    }

    //supply parameter for the amount of raw dmg dealt
    //check for mitigation
        //check for physical mitigation
            //apply flat reduction
                //Check for greater than 0
            //apply %-age reduction
        //check for magic mitigation
            //apply flat reduction
                //Check for greater than 0
            //apply %age reduction
            //apply resistances
                //check for damage type
                //check for resistances
    //reduce health by the final amount
        //check for zero or negative health
    /**
     * return value(?), boolean for death or the actual health reduction or the final health value?
     * Maybe we need a new datatype?
     * TODO END OF YOUR CODE!!!   END OF YOUR CODE!!!   END OF YOUR CODE!!!   END OF YOUR CODE!!!   END OF YOUR CODE!!!
     */


    /**
     * Getters and setters.
     */
    public String getSex(){     //"public" access allows other classes to retrieve the value of "sex", but since there
                                // is no setter it cannot be changed from outside the class = Encapsulation/Inkapsling
        return this.sex;
    }

    /**
     * Returns information about the Mage as a String.
     *
     * Overrides the default toString-method of Object.
     */
    @Override
    public String toString() {
        String sexString = "";

        if (this.sex == "M") {  //The class can always access it's own variables
            sexString = "He";
        } else if (this.sex == "F") {
            sexString = "She";
        }

        return "It's " + this.name + " a " + this.className + " . " +
                sexString + " has " + this.health + " hitpoints left.";
    }
}
