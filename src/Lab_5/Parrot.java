package lab5;

public class Parrot extends Bird implements BirdInt {
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

    public String getDescriptionBird() {
        return "This is Parrot. His age is " + getAge() + " years old. It's weight is " + getWeight() + " grams. " +
                "The height of its flight is " + getFlightAltitude() + " meters. Its height is " + getHeight() +
                " cm. His type is " + getTypeParrot() + "." ;
    }

}
