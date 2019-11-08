package tyreso.gymnasium.cardgame.io_examples.WakeUpGym;

public enum Aktivitet {
    SPINNING    ("Spinning"),
    AEROBICS    ("Aerobics"),
    YOGA        ("Yoga");

    private final String namn;  //String representation av enum

    Aktivitet(String namn) {
        this.namn = namn;
    }

    //Override för att skriva ut enum med små bokstäver.
    @Override
    public String toString(){
        return this.namn;
    }
}
