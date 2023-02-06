package zoo.model.people;

import zoo.model.ZooRules;
import zoo.model.animals.Animal;
import zoo.model.Ration;

public class Visitor extends Person {

    public Visitor(String name, float money) {
        super.setName(name);
        super.setMoney(money);
    }

    @Override
    public void feed(Animal animal, Ration food) {
        if(ZooRules.CONTACT_ZONE.contains(animal.getZone())){
            animal.eat(food);
        }else{
            System.out.println("Животных в этой зоне нельзя кормить");
        }
    }


}
