package lab3.decorator;

import lab3.Parrot;

public class IndonesianParrot implements Description{
    private final Parrot parrot;

    public IndonesianParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    @Override
    public String getDescription() {
        return this.parrot.getDescription() + " It's from Indonesia.";
    }
}
