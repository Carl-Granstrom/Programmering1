package tyreso.gymnasium._8_more_objects;

public class StaticKeyword {

    /**
     * Variables
     */
    private static long count;  //"static field" or "class variable"
    private String name;

    /**
     * Constructors
     */
    StaticKeyword(){
        count++;    //increments the Class Variable "count" by one each time you create an object, thus keeping track
                    //of how many objects you have created of the StaticKeyword class
    }

    /**
     * This is a sidetrack, dealing with the "private" keyword on a constructor.
     * @param name
     */
    private StaticKeyword(String name){
        this.name = name;   //There are some limited uses for a private constructor, and you probably will never use
                            //it. I'm just showing that it's possible. If you are interested you can Google the phrase
                            //"Singleton pattern in Java examples" or similar.
    }

    /**
     * Methods
     */
    public static String insultMe(){
        String insult = "You little twat, you just had to call the insultMe()-method, didn't you?";
        return insult;
    }

}
