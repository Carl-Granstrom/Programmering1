package tyreso.gymnasium._8_more_objects;

import java.util.Random;

/**
 * A spell to be cast in combat.
 */
public class Spell {

    String name = "fireball";
    String damageType = "fire";
    double manaCost = 8;
    double damage = 10;
    double critRate = 0.10;
    double critMultiplier = 0.50;
    double range = 8;

    //Constructor omitted. This is bad practice.

    /**
     * Check for critical hits and multiply the damage accordingly.
     * @return the damage the spell deals.
     */
    public double hit () {
        Random random = new Random();
        double critRange = random.nextDouble();

        if(this.critRate >= critRange){
            return this.damage * this.critMultiplier;
        }
        return this.damage;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
