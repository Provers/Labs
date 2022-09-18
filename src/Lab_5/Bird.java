package lab5;

public abstract class Bird extends Animal {
    private int flightAltitude;
    private int height;

    public Bird(int age, int weight, int flightAltitude, int height) {
        super(age, weight);
        this.flightAltitude = flightAltitude;
        this.height = height;
    }

    public int getFlightAltitude() {
        return flightAltitude;
    }

    public void setFlightAltitude(int flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
