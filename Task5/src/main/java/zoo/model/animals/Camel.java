package zoo.model.animals;

import zoo.model.Ration;
import zoo.model.Zone;
import zoo.model.feature.Walker;

import java.util.Arrays;

public final class Camel extends Animal implements Walker {
    public Camel(String name, String breed){
        this.name = name;
        this.breed = breed;
        this.zone = Zone.UNGULATES;
        this.ration = Arrays.asList(Ration.GRASS, Ration.WATER);
        getHungry();
    }

    @Override
    void getHungry() {
        this.isHungry = true;
    }

    @Override
    public void walk() {
        System.out.println(this.name + " ходит по вальеру");
    }

    @Override
    public void eat(Ration ration) {
        super.eat(ration);
        if (isHungry) {
            System.out.println(this.name + " плюёт в вашу сторону");
        }
    }
}
