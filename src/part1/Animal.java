package part1;

public abstract class Animal {
    private String name;
    private static int count;

    Animal(String name){
        this.name = name;
        count++;
    }

    static int getCount(){
        return count;
    }

    public String getName() {
        return name;
    }

    protected void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    protected void swim (int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }
}
