import org.junit.Test;
import static org.junit.Assert.*;

public class OrderItemsTest {

    @Test
    public void testOrderTotal() {
        CustomerOrder order = new CustomerOrder();
        order.addItem(new Burger());
        order.addItem(new Cheese(new Fries()));
        assertEquals(13.5, order.calculateTotal(), 0);
    }
}
