public class Avocado extends ToppingDecorator {
    public Avocado(Items foodItem) {
        super(foodItem);
    }

    @Override
    public double cost() {
        return foodItem.cost() + 1.0;
    }
}
