public abstract class ToppingDecorator implements Items {
    protected Items foodItem;

    public ToppingDecorator(Items foodItem) {
        this.foodItem = foodItem;
    }

    public abstract double cost();
}