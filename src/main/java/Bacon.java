public class Bacon extends ToppingDecorator {
    public Bacon(Items foodItem) {
        super(foodItem);
    }

    @Override
    public double cost() {
        return foodItem.cost() + 0.75; // Adding bacon costs an extra 0.75
    }
}