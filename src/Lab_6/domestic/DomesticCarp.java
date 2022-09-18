package lab6.domestic;

import lab6.Carp;
import lab6.CarpInt;

public class DomesticCarp extends Carp implements CarpInt {

    public DomesticCarp(int age, int weight, int immersionDepth, int length, String typeCarp) {
        super(age, weight, immersionDepth, length, typeCarp);
    }

    @Override
    public String getDescription() {
        return "This is a domestic Carp. His age is " + getAge() + " years old. It's weight is " + getWeight() + " grams. " +
                "The depth of its immersion is " + getImmersionDepth() + " meters. Its length is " + getLength() +
                " cm. His type is " + getTypeCarp();
    }
}
