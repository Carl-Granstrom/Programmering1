package tyreso.gymnasium._4_data_types_2;

public class Engine {

    int numCylinders;
    boolean isRunning;

    //Standard constructor giving 4 cylinders
    Engine(){
        numCylinders = 4;
        isRunning = false;
    }

    //Constructor allowing you to pick number of cylinders
    Engine(int numCylinders){
        this.numCylinders = numCylinders;
    }


    /**
     * Start the engine if it's not already running.
     * @return
     */
    public boolean ignite() {
        if (!isRunning) {
            isRunning = true;   //set isRunning to true before returning it if it was false
        }
        return isRunning;
    }

    /**
     * If engine is running, shut it down.
     *
     * @return  a String showing if the engine was turned off or not
     */
    public String shutDown() {
        if (isRunning) {
            this.isRunning = false;
            return "Shutting down engine";
        } else if (!isRunning) {
            //Do nothing here, just for demonstration.
        }
        return "Engine is not running, cannot turn it off";
    }
}
