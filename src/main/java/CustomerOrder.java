import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {
    private List<Items> items = new ArrayList<>();

    public void addItem(Items item) {
        items.add(item);
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(Items::cost).sum();
    }
}
