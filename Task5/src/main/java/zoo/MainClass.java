package zoo;

import zoo.model.*;
import zoo.model.animals.Camel;
import zoo.model.animals.Parrot;
import zoo.model.animals.Penguin;
import zoo.model.animals.Snake;
import zoo.model.people.Staff;
import zoo.model.people.Visitor;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("----------------Блок работы с посетителем-----------------");
        Visitor visitor = new Visitor("Рома", 160);
        visitor.buyProduct(SnacksAndDrinks.PEPSI);
        visitor.buyProduct(SnacksAndDrinks.BEER);
        visitor.buyProduct(SnacksAndDrinks.HAMBURGER);
        visitor.buyProduct(SnacksAndDrinks.WATER);
        System.out.println(visitor.getMoney());
        visitor.showInventory();
        System.out.println(visitor.inventory.size());
        visitor.eatOrDrinkRandomItemFromInventory(); //посетитель ест рандомный элемент из инвентаря
        visitor.showInventory();
        System.out.println(visitor.inventory.size());
        visitor.showRestOfMoney();

        System.out.println("----------------Блок работы с персоналом-----------------");
        Staff staff = new Staff("Kocтя", 55, 0.5F);
        staff.showRestOfMoney();
        staff.buyProduct(SnacksAndDrinks.CHIPS);
        staff.buyProduct(SnacksAndDrinks.LEMONADE);
        staff.showRestOfMoney();
        staff.showInventory();
        staff.eatOrDrink(staff.inventory.get(0)); //стаф кушает первый элемент в инвентаре
        staff.showInventory();


        System.out.println("----------------Блок попугая-----------------");
        Parrot parrot = new Parrot("Арагорн", "Ara"); //Создаём объект попугая
        parrot.learnPhrase("Чего вылупился на меня"); //Попугай учит фразу
        parrot.learnPhrase("Ты смотришь на меня без уважения"); //Попугает учит фразу
        parrot.learnPhrase("Да прибудет с тобой сила"); //Попугает учит фразу

        parrot.randomSpeak(); //Попугает говорит рандомную выученую фразу
        parrot.randomSpeak(); //Попугает говорит рандомную выученую фразу
        parrot.randomSpeak(); //Попугает говорит рандомную выученую фразу
        parrot.randomSpeak(); //Попугает говорит рандомную выученую фразу
        staff.feed(parrot, Ration.FRUITS); //стаф кормит попугая фруктами
        staff.feed(parrot, Ration.MEAT); //стаф пытается покормить попугая мясом
        parrot.fly();

        System.out.println("----------------Блок питона-----------------");
        Snake snake = new Snake("Питоша", "Python bivittatus");  //Создаём объект змеи
        staff.feed(snake, Ration.GRASS); //змея будет кусать кормящего если она голодная и кормящий при этом её пытался накормить тем, чо она не ест
        staff.feed(snake, Ration.MEAT); //тут змея перестанет быть голодной

        System.out.println("----------------Блок верблюда-----------------");
        Camel camel = new Camel("Вера", "Camelus ferus");
        camel.walk();
        staff.feed(camel, Ration.FISH);
        staff.feed(camel, Ration.GRASS);

        visitor.feed(camel, Ration.MEAT); // посетитель кормит верблюда не тем
        visitor.feed(camel, Ration.GRASS);

        System.out.println("----------------Блок пингвина-----------------");
        Penguin penguin = new Penguin("Ковальский", "King Penguin");
        penguin.swim();
        penguin.walk();
        staff.feed(penguin, Ration.SEEDS);
        staff.feed(penguin, Ration.FISH);

        visitor.feed(penguin, Ration.FISH);



    }
}
