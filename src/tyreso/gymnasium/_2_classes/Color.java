package tyreso.gymnasium._2_classes;

public class Color {

    String color;

    Color() {
        color = "Black";
    }

    public void changeColor(String color){
        this.color = color;
    }

    public String changeColorReturnsString(String color){
        this.color = color;
        return color;
    }

}
