import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PurchaseCalculatorTest {

    // Pruebas de calculateSubtotal()

    @Test
    void testCalculateSubTotal() {
        PurchaseCalculator product = new PurchaseCalculator();
        double result = product.calculateSubtotal(100, 3);
        assertEquals(300, result, 0.001);
    }

    @Test
    void testCalculateSubTotalQuantityOne() {
        PurchaseCalculator product = new PurchaseCalculator();
        double result = product.calculateSubtotal(250, 1);
        assertEquals(250, result, 0.001);
    }

    @Test
    void testCalculateSubTotalZero() {
        PurchaseCalculator product = new PurchaseCalculator();
        double result = product.calculateSubtotal(0, 1);
        assertEquals(0, result, 0.001);
    }

    // Pruebas de isValidPurchase()

    @Test
    void testIsValidPurchase() {
        PurchaseCalculator product = new PurchaseCalculator();
        assertTrue(product.isValidPurchase(100, 2));
    }

    @Test
    void testIsInvalidPurchaseZeroPrice() {
        PurchaseCalculator product = new PurchaseCalculator();
        assertFalse(product.isValidPurchase(0, 2));
    }

    @Test
    void testIsInvalidPurchaseZeroQuantity() {
        PurchaseCalculator product = new PurchaseCalculator();
        assertFalse(product.isValidPurchase(100, 0));
    }

    @Test
    void testIsInvalidPurchaseNegativePrice() {
        PurchaseCalculator product = new PurchaseCalculator();
        assertFalse(product.isValidPurchase(-50, 2));
    }

    // Pruebas de calculateDiscount()

    @Test
    void testCalculateDiscountBelowThreshold() {
        PurchaseCalculator product = new PurchaseCalculator();
        assertEquals(0, product.calculateDiscount(900), 0.001);
    }

    @Test
    void testCalculateDiscountAtThreshold() {
        PurchaseCalculator product = new PurchaseCalculator();
        assertEquals(100, product.calculateDiscount(1000), 0.001);
    }

    @Test
    void testCalculateDiscountAboveThreshold() {
        PurchaseCalculator product = new PurchaseCalculator();
        assertEquals(150, product.calculateDiscount(1500), 0.001);
    }

    // Pruebas de calculateFinalPrice()

    @Test
    void testCalculateFinalPriceWithoutDiscount() {
        PurchaseCalculator product = new PurchaseCalculator();
        assertEquals(900, product.calculateFinalPrice(900), 0.001);
    }

    @Test
    void testCalculateFinalPriceWithDiscount() {
        PurchaseCalculator product = new PurchaseCalculator();
        assertEquals(1350, product.calculateFinalPrice(1500), 0.001);
    }

    @Test
    void testCalculateFinalPriceAtThreshold() {
        PurchaseCalculator product = new PurchaseCalculator();
        assertEquals(900, product.calculateFinalPrice(1000), 0.001);
    }
}
