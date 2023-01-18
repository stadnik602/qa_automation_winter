package zoo.model.people;

import zoo.model.animals.Animal;
import zoo.model.Ration;
import zoo.model.SnacksAndDrinks;

public class Staff extends Person {
    private final float discount;
    public Staff(String name, float money, float discount) {
        super.setName(name);
        super.setMoney(money);
        this.discount = discount;
    }

    @Override
    public void feed(Animal animal, Ration food) {
        animal.eat(food);
    }

    @Override
    public void buyProduct(SnacksAndDrinks snacksAndDrinks) {
        if (this.getMoney() > (snacksAndDrinks.price * discount)) {
            this.setMoney(getMoney() - (snacksAndDrinks.price * discount));
            inventory.add(snacksAndDrinks);
            System.out.println(this.getName() + " купил " + snacksAndDrinks.name());
        }else {
            System.out.println("Недостаточно средств для покупки " + snacksAndDrinks.name());
        }
    }
}
