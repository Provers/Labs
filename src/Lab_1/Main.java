package lab1;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        showAnimal(randomAnimal(10));
    }

    public static ArrayList<Animal> randomAnimal(int n) {
        Random random = new Random();
        ArrayList<Animal> animalArray = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            switch (random.nextInt(4)){
                case 0 -> animalArray.add(new Parrot(random.nextInt(15)+3, random.nextInt(1000) + 200,
                            random.nextInt(2900) + 100, random.nextInt(50) + 5, getRandomTypeParrot()));
                case 1 -> animalArray.add(new Goose(random.nextInt(20)+3, random.nextInt(5000) + 500,
                            random.nextInt(8000) + 100, random.nextInt(80) + 5, getRandomTypeGoose()));
                case 2 -> animalArray.add(new Perch(random.nextInt(23)+3, random.nextInt(2000) + 200,
                            random.nextInt(2) + 1, random.nextInt(50) + 20, getRandomTypePerch()));
                case 3 -> animalArray.add(new Carp(random.nextInt(30)+3, random.nextInt(2300) + 200,
                            random.nextInt(3) + 1, random.nextInt(40) + 20, getRandomTypeCarp()));
            }
        }
        return animalArray;
    }

    public static void showAnimal(ArrayList<Animal> animalArray) {
        for (Animal animal : animalArray) {
            System.out.println(animal.getDescription());
        }
    }

    public static String getRandomTypeParrot() {
        ArrayList<String> listTypeParrot = new ArrayList<>();
        listTypeParrot.add("Cockatiel");
        listTypeParrot.add("Cockatoo");
        listTypeParrot.add("Budgie");
        return listTypeParrot.get(new Random().nextInt(3));
    }

    public static String getRandomTypeGoose() {
        ArrayList<String> listTypeParrot = new ArrayList<>();
        listTypeParrot.add("Gray");
        listTypeParrot.add("Nile");
        listTypeParrot.add("Andean");
        return listTypeParrot.get(new Random().nextInt(3));
    }

    public static String getRandomTypePerch() {
        ArrayList<String> listTypeParrot = new ArrayList<>();
        listTypeParrot.add("Yellow perch");
        listTypeParrot.add("Sunny");
        listTypeParrot.add("Perch-firebrand");
        return listTypeParrot.get(new Random().nextInt(3));
    }

    public static String getRandomTypeCarp() {
        ArrayList<String> listTypeParrot = new ArrayList<>();
        listTypeParrot.add("Scaly");
        listTypeParrot.add("Mirror");
        listTypeParrot.add("Koi");
        return listTypeParrot.get(new Random().nextInt(3));
    }
}
