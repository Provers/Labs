package lab6;

import lab6.factory.AnimalFactory;
import lab6.factory.DomesticAnimalFactory;
import lab6.factory.WildAnimalFactory;


public class Main {

    public static void main(String[] args) {
        AnimalFactory animalFactory = getAnimalFactory("WILD");


        ParrotInt parrot = animalFactory.getParrot();
        GooseInt goose = animalFactory.getGoose();
        PerchInt perch = animalFactory.getPerch();
        CarpInt carp = animalFactory.getCarp();

        System.out.println(parrot.getDescription());
        System.out.println(goose.getDescription());
        System.out.println(perch.getDescription());
        System.out.println(carp.getDescription());

    }

    public static AnimalFactory getAnimalFactory(String factoryName) {
        if (factoryName == null) {
            return null;
        }
        if (factoryName.equalsIgnoreCase("DOMESTIC")) {
            return new DomesticAnimalFactory();
        } else if (factoryName.equalsIgnoreCase("WILD")) {
            return new WildAnimalFactory();
        }
        return null;
    }
}
