import org.junit.Test;
import static org.junit.Assert.*;

public class DiscountItemsTest {

    @Test
    public void testApplyDiscount() {
        Discounts newCustomer = new Discounts(0.1); // 10% discount
        double discountedTotal = newCustomer.applyDiscount(10.0);
        assertEquals(9.0, discountedTotal, 0);
    }
}
