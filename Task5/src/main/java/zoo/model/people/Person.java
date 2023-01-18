package zoo.model.people;

import zoo.model.animals.Animal;
import zoo.model.Ration;
import zoo.model.SnacksAndDrinks;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private String name;
    private float money;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoney() {
        return money;
    }
    public void showRestOfMoney() {
        System.out.println ("Остаток денег в кармане: " + this.getMoney());
    }

    public void setMoney(float money) {
        this.money = money;
    }


    public void buyProduct(SnacksAndDrinks snacksAndDrinks) {
        if (this.money > snacksAndDrinks.price) {
            money -= snacksAndDrinks.price;
            inventory.add(snacksAndDrinks);
            System.out.println(this.name + " приобрёл " + snacksAndDrinks.name());
        }else {
            System.out.println("Недостаточно средств для покупки " + snacksAndDrinks.name());
        }
    }

    public void eatOrDrink(SnacksAndDrinks item) {
        if(item.type.equals("food")) {
            System.out.println(this.name + " кушает " + item.name());
        }else {
            System.out.println(this.name + " пьёт " + item.name());
        }
        inventory.remove(item);
    }

    public void eatOrDrinkRandomItemFromInventory() {
        int index = ((int) (Math.random() * inventory.size()));
        if (inventory.get(index).type.equals("food")) {
            System.out.println(this.name + " кушает " + inventory.get(index).name());
        }else{
            System.out.println(this.name + " пьёт " + inventory.get(index).name());
        }
        inventory.remove(inventory.get(index));

    }

    public void showInventory() {
        System.out.print("В инвенторе находится: ");
        for (SnacksAndDrinks snacksAndDrinks : inventory) {
            System.out.print(snacksAndDrinks + " ");
        }
        System.out.println();
    }
    public List<SnacksAndDrinks> inventory = new ArrayList<>();

    abstract void feed(Animal animal, Ration food);

}
