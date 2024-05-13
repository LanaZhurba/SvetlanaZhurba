package part1;

public class Dog extends Animal {
    private static int LIMIT_DISTANCE_RUN = 500;
    private static int LIMIT_DISTANCE_SWIM = 10;
    private static int count;

    Dog(String name) {
        super(name);
        count++;
    }

    static int getCount(){
        return count;
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
        if (distance <= LIMIT_DISTANCE_SWIM) {
            super.swim(distance);
        } else {
            System.out.println("Задана слишком большая дистанция для плавания");
        }
    }
}
