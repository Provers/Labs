package lab5;


import lab5.factory.BirdFactory;
import lab5.factory.FishFactory;

public class Main {

    public static void main(String[] args) {
        BirdFactory birdFactory = new BirdFactory();
        BirdInt bird1 = birdFactory.getBird("PARROT");
        BirdInt bird2 = birdFactory.getBird("GOOSE");

        FishFactory fishFactory = new FishFactory();
        FishInt fish1 = fishFactory.getFish("PERCH");
        FishInt fish2 = fishFactory.getFish("CARP");

        System.out.println(bird1.getDescriptionBird());
        System.out.println(bird2.getDescriptionBird());

        System.out.println(fish1.getDescriptionFish());
        System.out.println(fish2.getDescriptionFish());

    }

}
