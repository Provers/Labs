package lab3.decorator;

import lab3.Carp;

public class CentralAsianCarp implements Description {
    private final Carp carp;

    public CentralAsianCarp(Carp carp) {
        this.carp = carp;
    }

    @Override
    public String getDescription() {
        return carp.getDescription() + " It's from Central Asia.";
    }
}
