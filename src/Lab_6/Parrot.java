package lab6;

public abstract class Parrot extends Bird {
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

}
