package lab1;

public class Perch extends Fish {
    private String typePerch;

    public Perch(int age, int weight, int immersionDepth, int length, String typePerch) {
        super(age, weight, immersionDepth, length);
        this.typePerch = typePerch;
    }

    public String getTypePerch() {
        return typePerch;
    }

    public void setTypePerch(String typePerch) {
        this.typePerch = typePerch;
    }

    public String getDescription() {
        return "This is Perch. His age is " + getAge() + " years old. It's weight is " + getWeight() + " grams. " +
                "The depth of its immersion is " + getImmersionDepth() + " meters. Its length is " + getLength() +
                " cm. His type is " + getTypePerch();
    }
}

