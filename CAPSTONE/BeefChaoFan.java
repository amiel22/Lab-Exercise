public class BeefChaoFan extends Food {
    public BeefChaoFan(int quantity) {
        super(quantity);
    }

    @Override
    public double getPrice() {
        return 50 * quantity;
    }
}
