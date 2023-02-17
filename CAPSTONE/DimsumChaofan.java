public class DimsumChaofan extends Food {
    public DimsumChaofan(int quantity) {
        super(quantity);
    }

    @Override
    public double getPrice() {
        return 50 * quantity;
    }
}
