package lab3;

import lab3.decorator.*;

import java.util.ArrayList;
import java.util.Random;



public class Main {

    public static void main(String[] args) {
        showAnimal(randomAnimal(10));
    }

    public static ArrayList<Description> randomAnimal(int n) {
        Random random = new Random();
        ArrayList<Description> animalArray = new ArrayList<>();
        Parrot parrot;
        Goose goose;
        Perch perch;
        Carp carp;


        for (int i = 0; i < n; i++) {
            switch (random.nextInt(4)){
                case 0 -> {
                    parrot = new Parrot(random.nextInt(15)+3, random.nextInt(1000) + 200,
                            random.nextInt(2900) + 100, random.nextInt(50) + 5, getRandomTypeParrot());
                    animalArray.add((random.nextInt(2) == 0 ? new AustralianParrot(parrot) : new IndonesianParrot(parrot)));
                }
                case 1 -> {
                    goose = new Goose(random.nextInt(20)+3, random.nextInt(5000) + 500,
                                random.nextInt(8000) + 100, random.nextInt(80) + 5, getRandomTypeGoose());
                    animalArray.add((random.nextInt(2) == 0 ? new AfricanGoose(goose) : new AustralianGoose(goose)));
                }
                case 2 -> {
                    perch = new Perch(random.nextInt(23)+3, random.nextInt(2000) + 200,
                                random.nextInt(2) + 1, random.nextInt(50) + 20, getRandomTypePerch());
                    animalArray.add((random.nextInt(2) == 0 ? new SouthAmericanPerch(perch) : new RussianPerch(perch)));
                }
                case 3 -> {
                    carp = new Carp(random.nextInt(30)+3, random.nextInt(2300) + 200,
                                random.nextInt(3) + 1, random.nextInt(40) + 20, getRandomTypeCarp());
                    animalArray.add((random.nextInt(2) == 0 ? new CentralAsianCarp(carp) : new FarEasternCarp(carp)));
                }
            }
        }
        return animalArray;
    }

    public static void showAnimal(ArrayList<Description> animalArray) {
        for (Description description : animalArray) {
            System.out.println(description.getDescription());
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
