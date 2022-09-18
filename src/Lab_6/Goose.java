package lab6;

public abstract class Goose extends Bird {
    private String typeGoose;

    public Goose(int age, int weight, int flightAltitude, int height, String typeGoose) {
        super(age, weight, flightAltitude, height);
        this.typeGoose = typeGoose;
    }

    public String getTypeGoose() {
        return typeGoose;
    }

    public void setTypeGoose(String typeGoose) {
        this.typeGoose = typeGoose;
    }

}
