package aquarium.entities.fish;

public class SaltwaterFish extends BaseFish{

    private static final int INITIAL_SIZE = 5;

    public SaltwaterFish(String name, String species, double price) {
        super(name, species, price);
    }

    @Override
    public int eat() {
        int oldSize = INITIAL_SIZE;
        int newSize = 2 + oldSize;
        return newSize;
    }
}
