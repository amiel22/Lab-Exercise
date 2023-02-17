public class Halohalo extends Food {
    public Halohalo(int quantity) {
        super(quantity);
    }

    @Override
    public double getPrice() {
        return 50 * quantity;
    }
}
