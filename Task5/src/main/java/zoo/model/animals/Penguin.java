package zoo.model.animals;

import zoo.model.Ration;
import zoo.model.Zone;
import zoo.model.feature.Swimmer;
import zoo.model.feature.Walker;

import java.util.Arrays;

public final class Penguin extends Animal implements Walker, Swimmer {

    public Penguin(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.zone = Zone.BIRDS;
        this.ration = Arrays.asList(Ration.FISH, Ration.WATER);
        getHungry();
    }

    @Override
    void getHungry() {
        super.isHungry = true;
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " плавает в басейне");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " ходит по пингвиньи");
    }
}
