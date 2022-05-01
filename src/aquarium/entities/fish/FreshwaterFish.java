package aquarium.entities.fish;

public class FreshwaterFish extends BaseFish{

    private static final int INITIAL_SIZE = 3;

    public FreshwaterFish(String name, String species, double price) {
        super(name, species, price);
    }

    @Override
    public int eat() {
      int oldSize = INITIAL_SIZE;
      int newSize = 3 + oldSize;
      return newSize;
    }
}
