import org.junit.Test;
import static org.junit.Assert.*;

public class ToppingsItemsTest {

    @Test
    public void testBurgerWithBacon() {
        Items burgerWithBacon = new Bacon(new Burger());
        assertEquals(8.75, burgerWithBacon.cost(), 0);
    }

    @Test
    public void testFriesWithCheese() {
        Items friesWithCheese = new Cheese(new Fries());
        assertEquals(5.5, friesWithCheese.cost(), 0);
    }

    @Test
    public void testSandwichWithAvocado() {
        Items sandwichWithAvocado = new Avocado(new Sandwich());
        assertEquals(8.0, sandwichWithAvocado.cost(), 0);
    }
}
