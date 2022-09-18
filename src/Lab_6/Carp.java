package lab6;

public abstract class Carp extends Fish {
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

}
