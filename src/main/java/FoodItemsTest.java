import org.junit.Test;
import static org.junit.Assert.*;

public class FoodItemsTest {

    @Test
    public void testBurgerCost() {
        Items burger = new Burger();
        assertEquals(8.0, burger.cost(), 0);
    }

    @Test
    public void testFriesCost() {
        Items fries = new Fries();
        assertEquals(5.0, fries.cost(), 0);
    }

    @Test
    public void testSandwichCost() {
        Items sandwich = new Sandwich();
        assertEquals(7.0, sandwich.cost(), 0);
    }

    @Test
    public void testPancakesCost() {
        Items pancakes = new Pancakes();
        assertEquals(10.0, pancakes.cost(), 0);
    }

    @Test
    public void testHotdogCost() {
        Items hotDog = new Hotdog();
        assertEquals(5.0, hotDog.cost(), 0);
    }
}
