package lab3.decorator;

import lab3.Perch;

public class SouthAmericanPerch implements Description{
    private final Perch perch;

    public SouthAmericanPerch(Perch perch) {
        this.perch = perch;
    }

    @Override
    public String getDescription() {
        return perch.getDescription() + " It's from South America.";
    }
}
