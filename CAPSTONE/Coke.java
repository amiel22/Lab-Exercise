public class Coke extends Drinks {
    public Coke(int drinks) {
        super(drinks);
    }

    @Override
    public double getPrice() {
        return 53 * drinks;
    }
}
