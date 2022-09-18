package lab5.factory;

import lab5.BirdInt;
import lab5.Goose;
import lab5.Parrot;

import java.util.ArrayList;
import java.util.Random;

public class BirdFactory {

    public BirdInt getBird(String birdName) {
        Random random = new Random();
        if (birdName == null){
            return null;
        }
        if (birdName.equalsIgnoreCase("PARROT")) {
            return new Parrot(random.nextInt(15)+3, random.nextInt(1000) + 200,
                    random.nextInt(2900) + 100, random.nextInt(50) + 5,
                    getRandomTypeParrot());
        } else if(birdName.equalsIgnoreCase("GOOSE")){
            return new Goose(random.nextInt(20)+3, random.nextInt(5000) + 500,
                    random.nextInt(8000) + 100, random.nextInt(80) + 5,
                    getRandomTypeGoose());
        }
        return null;
    }

    public String getRandomTypeParrot() {
        ArrayList<String> listTypeParrot = new ArrayList<>();
        listTypeParrot.add("Cockatiel");
        listTypeParrot.add("Cockatoo");
        listTypeParrot.add("Budgie");
        return listTypeParrot.get(new Random().nextInt(3));
    }

    public String getRandomTypeGoose() {
        ArrayList<String> listTypeParrot = new ArrayList<>();
        listTypeParrot.add("Gray");
        listTypeParrot.add("Nile");
        listTypeParrot.add("Andean");
        return listTypeParrot.get(new Random().nextInt(3));
    }




}
