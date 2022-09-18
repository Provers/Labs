package lab6.domestic;

import lab6.Perch;
import lab6.PerchInt;

public class DomesticPerch extends Perch implements PerchInt {
    public DomesticPerch(int age, int weight, int immersionDepth, int length, String typePerch) {
        super(age, weight, immersionDepth, length, typePerch);
    }

    @Override
    public String getDescription() {
        return "This is a domestic Perch. His age is " + getAge() + " years old. It's weight is " + getWeight() + " grams. " +
                "The depth of its immersion is " + getImmersionDepth() + " meters. Its length is " + getLength() +
                " cm. His type is " + getTypePerch();
    }
}
