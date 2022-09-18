package lab6.factory;

import lab6.*;

public interface AnimalFactory {
    ParrotInt getParrot();
    GooseInt getGoose();
    PerchInt getPerch();
    CarpInt getCarp();
}
