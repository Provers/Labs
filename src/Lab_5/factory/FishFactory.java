package lab5.factory;

import lab5.Carp;
import lab5.FishInt;
import lab5.Perch;

import java.util.ArrayList;
import java.util.Random;

public class FishFactory {


    public FishInt getFish(String fishName){
         Random random = new Random();
        if (fishName == null){
            return null;
        }
        if (fishName.equalsIgnoreCase("PERCH")) {
            return new Perch(random.nextInt(23)+3, random.nextInt(2000) + 200,
                    random.nextInt(2) + 1, random.nextInt(50) + 20, getRandomTypePerch());
        } else if(fishName.equalsIgnoreCase("CARP")){
            return new Carp(random.nextInt(30)+3, random.nextInt(2300) + 200,
                    random.nextInt(3) + 1, random.nextInt(40) + 20, getRandomTypeCarp());
        }
        return null;
    }

    public String getRandomTypePerch() {
        ArrayList<String> listTypeParrot = new ArrayList<>();
        listTypeParrot.add("Yellow perch");
        listTypeParrot.add("Sunny");
        listTypeParrot.add("Perch-firebrand");
        return listTypeParrot.get(new Random().nextInt(3));
    }

    public String getRandomTypeCarp() {
        ArrayList<String> listTypeParrot = new ArrayList<>();
        listTypeParrot.add("Scaly");
        listTypeParrot.add("Mirror");
        listTypeParrot.add("Koi");
        return listTypeParrot.get(new Random().nextInt(3));
    }
}
