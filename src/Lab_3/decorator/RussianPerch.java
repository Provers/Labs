package lab3.decorator;

import lab3.Perch;

public class RussianPerch implements Description{
    private final Perch perch;

    public RussianPerch(Perch perch) {
        this.perch = perch;
    }

    @Override
    public String getDescription() {
        return perch.getDescription() + " It's from Russia.";
    }
}
