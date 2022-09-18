package lab6.wild;

import lab6.Carp;
import lab6.CarpInt;

public class WildCarp extends Carp implements CarpInt {

    public WildCarp(int age, int weight, int immersionDepth, int length, String typeCarp) {
        super(age, weight, immersionDepth, length, typeCarp);
    }

    @Override
    public String getDescription() {
        return "This is a wild Carp. His age is " + getAge() + " years old. It's weight is " + getWeight() + " grams." +
                " The depth of its immersion is " + getImmersionDepth() + " meters. Its length is " + getLength() +
                " cm. His type is " + getTypeCarp();
    }
}
