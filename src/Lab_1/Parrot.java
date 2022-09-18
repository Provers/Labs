package lab1;

public class Parrot extends Bird{
    private String typeParrot;

    public Parrot(int age, int weight, int flightAltitude, int height, String typeParrot) {
        super(age, weight, flightAltitude, height);
        this.typeParrot = typeParrot;
    }

    public String getTypeParrot() {
        return typeParrot;
    }

    public void setTypeParrot(String typeParrot) {
        this.typeParrot = typeParrot;
    }

    public String getDescription() {
        return "This is Parrot. His age is " + getAge() + " years old. It's weight is " + getWeight() + " grams. " +
                "The height of its flight is " + getFlightAltitude() + " meters. Its height is " + getHeight() +
                " cm. His type is " + getTypeParrot() + "." ;
    }
}
