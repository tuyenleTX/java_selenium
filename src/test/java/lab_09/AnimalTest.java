package lab_09;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import static lab_09.AnimalBuilderDesignPattern.Builder;

public class AnimalTest {


    public static void main(String[] args) {
        Builder builder = new  Builder();

        //method chaining
        AnimalBuilderDesignPattern horse = builder.setName("Horse").setSpeed(new SecureRandom().nextInt(75)).setWithWings(false).build();
        AnimalBuilderDesignPattern tiger = builder.setName("Tiger").setSpeed(new SecureRandom().nextInt(100)).setWithWings(false).build();
        AnimalBuilderDesignPattern falcon = builder.setName("Falcon").setSpeed(new SecureRandom().nextInt(120)).setWithWings(true).build();
        AnimalBuilderDesignPattern eagle = builder.setName("Eagle").setSpeed(new SecureRandom().nextInt(150)).setWithWings(true).build();
        AnimalBuilderDesignPattern dog = builder.setName("Dog").setSpeed(new SecureRandom().nextInt(60)).setWithWings(false).build();

        List<AnimalBuilderDesignPattern> animalList = new ArrayList<>();
        animalList.add(tiger);
        animalList.add(horse);
        animalList.add(falcon);
        animalList.add(eagle);
        animalList.add(dog);
        AnimalBuilderDesignPattern winner = animalList.get(0);
        System.out.println(winner.getName());
        System.out.println(winner.getSpeed());
        for(int i = 1; i < animalList.size(); i++){
            if(animalList.get(i).isWithWings()== false) {
                System.out.println(animalList.get(i).getName());
                System.out.println(animalList.get(i).getSpeed());
                if (animalList.get(i).getSpeed() > winner.getSpeed()) {
                    winner = builder.setName(animalList.get(i).getName()).setSpeed(animalList.get(i).getSpeed()).build();
                }
            }
        }
        System.out.println("Winner is " + winner.getName() + ", with speed: " + winner.getSpeed());
    }

}
