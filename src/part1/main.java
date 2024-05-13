package part1;

public class main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");

        dog1.run(20);
        dog2.swim(10);

        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Рыжий");
        Cat cat3 = new Cat("Таракан");

        cat1.run(50);
        cat2.swim(20);
        cat3.run(10);

        System.out.println("Всего животных: " + Animal.getCount());
        System.out.println("Количество собак - " + Dog.getCount());
        System.out.println("Количество кошек - "+ Cat.getCount());

        Cat[] catsarray = new Cat[5];
        catsarray[0] = new Cat("Белый");
        catsarray[1] = new Cat("Желтый");
        catsarray[2] = new Cat("Красный");
        catsarray[3] = new Cat("Зеленый");
        catsarray[4] = new Cat("Голубой");

        Bowl catBowl = new Bowl(20);
        catBowl.addFoodInBowl(15);

        for (Cat cat: catsarray) {
            catBowl.setSize(cat.eat(catBowl.getSize()));
        }

        for (Cat cat: catsarray) {
            cat.getIsSatiety();
        }
    }



}
