public class PorkChaoFan extends Food {
    public PorkChaoFan(int quantity) {
        super(quantity);
    }

    @Override
    public double getPrice() {
        return 45 * quantity;
    }
}
