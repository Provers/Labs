package lab6.wild;

import lab6.Perch;
import lab6.PerchInt;

public class WildPerch extends Perch implements PerchInt {
    public WildPerch(int age, int weight, int immersionDepth, int length, String typePerch) {
        super(age, weight, immersionDepth, length, typePerch);
    }

    @Override
    public String getDescription() {
        return "This is a wild Perch. His age is " + getAge() + " years old. It's weight is " + getWeight() + " grams" +
                ". The depth of its immersion is " + getImmersionDepth() + " meters. Its length is " + getLength() +
                " cm. His type is " + getTypePerch();
    }
}
