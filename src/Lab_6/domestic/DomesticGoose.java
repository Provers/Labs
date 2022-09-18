package lab6.domestic;

import lab6.Goose;
import lab6.GooseInt;

public class DomesticGoose extends Goose implements GooseInt {

    public DomesticGoose(int age, int weight, int flightAltitude, int height, String typeGoose) {
        super(age, weight, flightAltitude, height, typeGoose);
    }

    @Override
    public String getDescription() {
        return "This is a domestic Goose. His age is " + getAge() + " years old. It's weight is " + getWeight() + " grams. " +
                "The height of its flight is " + getFlightAltitude() + " meters. Its height is " + getHeight() +
                " cm. His type is " + getTypeGoose() + ".";
    }
}
