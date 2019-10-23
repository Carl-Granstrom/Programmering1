package tyreso.gymnasium._6_ddd_domain_driven_design.cars;

/**
 * Add variables and methods to make this version of the Car-class something that functions for a 2d driving game.
 */
public class Car2d {

    //Declare variables
    String name;
    String brand;
    String model;
    String texture;
    double speed;
    double maxSpeed;
    double maxAcceleration;
    int numSeats;
    long value;
    int dmgState;
    boolean lightsOn;
    double directionX;
    double directionY;

    //Constructor
    Car2d(String name, String brand, long value){
        this.name = name;
        this.brand = brand;
        this.model = "740";
        this.texture = "Zebra";
        this.speed = 0;
        this.maxSpeed = 200;
        this.maxAcceleration = 20;
        this.numSeats = 4;
        this.value = value;
        this.dmgState = 0;
        this.lightsOn = false;
        this.directionX = 0;
        this.directionY = 0;



    }

    //Methods

}
