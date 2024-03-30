public class RestaurantDriver {
    public static void main(String[] args) {
        Items burgerWithCheese = new Cheese(new Burger());
        Items friesWithBacon = new Bacon(new Fries());

        CustomerOrder order = new CustomerOrder();
        order.addItem(burgerWithCheese);
        order.addItem(friesWithBacon);

        double total = order.calculateTotal();
        System.out.println(STR."\nTotal cost of all: $\{String.format("%.2f", total)}");

        Discounts newCustomer = new Discounts(0.1);
        double totalAfterDiscount = newCustomer.applyDiscount(total);
        System.out.println(STR."\nPrice after discount has been applied: $\{String.format("%.2f", totalAfterDiscount)}");
    }
}
