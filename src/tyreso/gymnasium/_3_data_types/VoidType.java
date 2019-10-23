package tyreso.gymnasium._3_data_types;

public class VoidType {

    /**
     * Void/Null behöver inte deklareras separat, utan visar att det saknas ett objekt.
     */
    Cow cow = null;   //Skapa en referens (mer om detta snart) till ett objekt av typen BooleanTypes
                                //som inte pekar på något objekt alls.

    Horse horse = null; //Observera att alla variabeldeklarationer av referenstyper som bara deklarerats utan
                                //att initialiseras till ett värde automatiskt får värdet null, så denna initialisering
                                //är egentligen överflödig.

    /**
     * Void används som nyckelord för att visa att en metod inte returnerar ett värde alls.
     */
    public int returnNothing() {
        //Do whatever you want
        //TODO remove the "//" in the next line and see what error IntelliJ gives you!
        return 0;
    }


}
