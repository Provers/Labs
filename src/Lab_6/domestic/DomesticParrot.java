package lab6.domestic;

import lab6.Parrot;
import lab6.ParrotInt;

public class DomesticParrot extends Parrot implements ParrotInt {

    public DomesticParrot(int age, int weight, int flightAltitude, int height, String typeParrot) {
        super(age, weight, flightAltitude, height, typeParrot);
    }

    @Override
    public String getDescription() {
        return "This is a domestic Parrot. His age is " + getAge() + " years old. It's weight is " + getWeight() + " grams. " +
                "The height of its flight is " + getFlightAltitude() + " meters. Its height is " + getHeight() +
                " cm. His type is " + getTypeParrot() + "." ;
    }
}
