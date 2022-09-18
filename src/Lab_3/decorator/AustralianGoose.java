package lab3.decorator;

import lab3.Goose;

public class AustralianGoose implements Description{
    private final Goose goose;

    public AustralianGoose(Goose goose) {
        this.goose = goose;
    }

    @Override
    public String getDescription() {
        return this.goose.getDescription() + " It's from Australia.";
    }
}
