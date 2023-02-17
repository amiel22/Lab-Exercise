public class DimsumBeefChaoFan extends Food {
    public DimsumBeefChaoFan(int quantity) {
        super(quantity);
    }

    @Override
    public double getPrice() {
        return 40 * quantity;
    }
}
