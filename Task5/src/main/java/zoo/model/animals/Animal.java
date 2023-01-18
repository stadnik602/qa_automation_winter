package zoo.model.animals;

import zoo.model.Ration;
import zoo.model.Zone;

import java.util.List;

public abstract class Animal {
    protected String breed;
    protected String name;
    protected Zone zone;
    protected boolean isHungry;

    List<Ration> ration;

    public String getName() {
        return this.name;
    }

    public Zone getZone() {
        return zone;
    }

    abstract void getHungry();

    public void eat(Ration ration) {
        if (this.ration.contains(ration)) {
            isHungry = false;
            System.out.println(this.name + " ест " + ration.name());
        }else {
            System.out.println(this.name + " не ест " + ration.name());
        }
    }
}
