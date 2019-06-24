package tyreso.gymnasium._4_data_types_2;

public class Door {

    String doorType;
    boolean isOpen;     //default value of boolean is "false".

    Door(String doorType){
        this.doorType = doorType;   //this.doorType is the object's variable, whereas doorType is the passed parameter
    }
}
