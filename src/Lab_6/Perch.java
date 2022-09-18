package lab6;

public abstract class Perch extends Fish {
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

}

