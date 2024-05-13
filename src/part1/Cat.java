package part1;

public class Cat extends Animal {
    private static int LIMIT_DISTANCE_RUN = 200;
    private static int count;
    private boolean satiety;

    Cat(String name) {
        super(name);
        satiety = false;
        count++;
    }

    static int getCount(){
        return count;
    }

    public int eat(int bowl) {
        if (!satiety && bowl > 15) {
            satiety = true;
            bowl -= 15;
        }
        return bowl;
    }

    void getIsSatiety(){
        if (satiety) {
            System.out.println("Кот " + getName() + " сытый");
        } else {
            System.out.println("Кот " + getName() + " голоден");
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= LIMIT_DISTANCE_RUN) {
            super.run(distance);
        } else {
            System.out.println("Задана слишком большая дистанция для бега");
        }
    }

    @Override
    public void swim(int distance) {
       System.out.println("Кот не умеет плавать");
    }
}
