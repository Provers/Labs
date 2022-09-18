package lab3.decorator;

import lab3.Carp;

public class FarEasternCarp implements Description{
    private final Carp carp;

    public FarEasternCarp(Carp carp) {
        this.carp = carp;
    }

    @Override
    public String getDescription() {
        return carp.getDescription() + " It's from Far East.";
    }
}
