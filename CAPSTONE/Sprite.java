public class Sprite extends Drinks {
    public Sprite(int drinks) {
        super(drinks);
    }

    @Override
    public double getPrice() {
        return 53 * drinks;
    }
}
