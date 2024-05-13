package part1;

public class Bowl {
    private int size;

    Bowl(int size) {
        this.size = size;
    }

    protected void setSize(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }

    public void addFoodInBowl(int food) {
        if (food > 0) {
            setSize(this.size + food);
        }
    }
}
