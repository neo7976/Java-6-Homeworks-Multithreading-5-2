import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator cl;

    @BeforeEach
    void setUp() {
        System.out.println("Начало теста");
        cl = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Окончание теста");
        cl = null;
    }

    @Test
    void monthPayment() {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.FLOOR);
        Assertions.assertEquals("18715,43", df.format(cl.monthPayment(300_000, 0.15, 18)));
    }

    @Test
    void sumPayment_test() {
        Assertions.assertEquals("336877,74", cl.sumPayment(300_000, 0.15, 18));
    }
}