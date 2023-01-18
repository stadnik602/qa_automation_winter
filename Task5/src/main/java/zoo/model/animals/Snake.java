package zoo.model.animals;

import zoo.model.Ration;
import zoo.model.Zone;
import zoo.model.feature.Crawler;

import java.util.ArrayList;

public final class Snake extends Animal implements Crawler {
    public Snake(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.zone = Zone.REPTILES;
        this.ration = new ArrayList<>();
        this.ration.add(Ration.MEAT);
        getHungry();
    }

    @Override
    public void crawl() {
        System.out.println(this.getName() + " неспеша двигается к кормящему");
    }

    public void attack() {
        crawl();
        System.out.println(this.getName() + " кусает кормящего");

    }

    @Override
    void getHungry() {
        this.isHungry = true;
    }

    @Override
    public void eat(Ration ration) {
        super.eat(ration);
        if (isHungry) {
            attack();
        }
    }
}
