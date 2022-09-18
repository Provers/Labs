package lab3;

public class Goose extends Bird {
    private String typeGoose;

    public Goose(){
        super();
    }

    public Goose(int age, int weight, int flightAltitude, int height, String typeGoose) {
        super(age, weight, flightAltitude, height);
        this.typeGoose = typeGoose;
    }

    public String getTypeGoose() {
        return typeGoose;
    }

    public void setTypeGoose(String typeGoose) {
        this.typeGoose = typeGoose;
    }

    public String getDescription() {
        return "This is Goose. His age is " + getAge() + " years old. It's weight is " + getWeight() + " grams. " +
                "The height of its flight is " + getFlightAltitude() + " meters. Its height is " + getHeight() +
                " cm. His type is " + getTypeGoose() + "." ;
    }
}
