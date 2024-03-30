public class Cheese extends ToppingDecorator {
    public Cheese(Items foodItem) {
        super(foodItem);
    }

    @Override
    public double cost() {
        return foodItem.cost() + 0.5; // Adding bacon costs an extra 0.75
    }
}