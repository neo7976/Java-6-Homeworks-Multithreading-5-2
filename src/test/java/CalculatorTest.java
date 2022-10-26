import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;

class CalculatorTest {
    Calculator cl;
    DecimalFormat df = new DecimalFormat("#.##");

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
        df.setRoundingMode(RoundingMode.FLOOR);
        Assertions.assertEquals("18715,43", df.format(cl.monthPayment(300_000, 0.15, 18)));
    }

    @Test
    void sumPayment_test() {
        df.setRoundingMode(RoundingMode.FLOOR);
        Assertions.assertEquals("336877,85", df.format(cl.sumPayment(300_000, 0.15, 18)));
    }
    @Test
    void overpayment_test() {
        df.setRoundingMode(RoundingMode.FLOOR);
        Assertions.assertEquals("36877,85", df.format(cl.overpayment(300_000, 0.15, 18)));
    }
}