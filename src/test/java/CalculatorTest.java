import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

        Assertions.assertEquals();
    }
}