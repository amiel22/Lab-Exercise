public class IcedTea extends Drinks {
    public IcedTea(int quantity) {
        super(quantity);
    }

    @Override
    public double getPrice() {
        return 58 * drinks;
    }
}
