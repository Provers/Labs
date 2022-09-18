package lab1;

public abstract class Fish extends Animal {
    private int immersionDepth;
    private int length;

    public Fish(int age, int weight, int immersionDepth, int length) {
        super(age, weight);
        this.immersionDepth = immersionDepth;
        this.length = length;
    }

    public int getImmersionDepth() {
        return immersionDepth;
    }

    public void setImmersionDepth(int immersionDepth) {
        this.immersionDepth = immersionDepth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public abstract String getDescription();
}
