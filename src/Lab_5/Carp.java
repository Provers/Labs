package lab5;

public class Carp extends Fish implements FishInt {
    private String typeCarp;

    public Carp(int age, int weight, int immersionDepth, int length, String typeCarp) {
        super(age, weight, immersionDepth, length);
        this.typeCarp = typeCarp;
    }

    public String getTypeCarp() {
        return typeCarp;
    }

    public void setTypeCarp(String typeCarp) {
        this.typeCarp = typeCarp;
    }

    public String getDescriptionFish() {
        return "This is Carp. His age is " + getAge() + " years old. It's weight is " + getWeight() + " grams. " +
                "The depth of its immersion is " + getImmersionDepth() + " meters. Its length is " + getLength() +
                " cm. His type is " + getTypeCarp();
    }
}
