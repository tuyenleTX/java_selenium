package lab_08;

import java.util.*;

public class Lab8AnimalAssignment {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Animal animal1 = new Horse();
        Animal animal2 = new Tiger();
        Animal animal3 = new Dog();
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);

        Animal winner = new Animal();
        winner.setSpeed(animal1.getSpeed());
        winner.setName(animal1.getName());
        System.out.println(winner.getName());
        System.out.println(winner.getSpeed());
        for(int i = 1; i < animalList.size(); i++){
            System.out.println(animalList.get(i).getName());
            System.out.println(animalList.get(i).getSpeed());
            if (animalList.get(i).getSpeed() > winner.getSpeed()) {
                winner.setName(animalList.get(i).getName());
                winner.setSpeed(animalList.get(i).getSpeed());
            }
        }
        System.out.println("Winner is " + winner.getName() + ", with speed: " + winner.getSpeed());
    }
}
