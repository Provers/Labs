package lab7;

public class Room {
    private String type;
    private int square;

    public Room(String type, int square) {
        this.type = type;
        this.square = square;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }



    @Override
    public String toString() {
        return "Room{" +
                "type='" + type + '\'' +
                ", square=" + square +
                '}';
    }
}
