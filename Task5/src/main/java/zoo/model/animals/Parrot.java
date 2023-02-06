package zoo.model.animals;

import zoo.model.Ration;
import zoo.model.Zone;
import zoo.model.feature.Flyer;
import zoo.model.feature.Walker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Parrot extends Animal implements Flyer, Walker {
    private final List<String> phrases = new ArrayList<>();
    public Parrot(String name, String breed){
        this.name = name;
        this.breed = breed;
        this.zone = Zone.BIRDS;
        this.ration = Arrays.asList(Ration.SEEDS, Ration.FRUITS);
        getHungry();
    }

    public void learnPhrase(String phrase) {
        phrases.add(phrase);
    }

    public void randomSpeak() {
        int max = phrases.size();
        System.out.println(phrases.get((int) (Math.random() * max)));
    }

    @Override
    void getHungry() {
        this.isHungry = true;
    }


    @Override
    public void fly() {
        System.out.println(this.getName() + " летает");
    }

    @Override
    public void eat(Ration ration) {
        super.eat(ration);
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " ходит по территории");

    }
}
