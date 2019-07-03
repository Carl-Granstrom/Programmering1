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
    private String name;
    private String className;
    private String sex;
    private long health;
    //add variable to hold the health regen
    private long mana;
    //add variable to hold the mana regen
    private List<Spell> spells;     //We will have a deeper look at this for next class
    private Spell fireball;

    //Constructor
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
        Spell spell = spells.get(spellNumber);
        this.mana -= spell.manaCost;
        return spell.hit();
    }

    /**
     * This method handles how the Mage takes damage. Depending on implementation you might need to add more variables
     * as well.
     */
    //TODO YOUR CODE HERE!!!   YOUR CODE HERE!!!   YOUR CODE HERE!!!   YOUR CODE HERE!!!   YOUR CODE HERE!!!

    //parameter for the amount of raw dmg dealt
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
