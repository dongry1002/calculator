package calculator;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorApplicationTest {
    private CalculatorApplication calculatorApplication;

    CalculatorApplicationTest(){
        this.calculatorApplication = new CalculatorApplication();
    }

    @Test
    void main() {
        String[] value = {"2 + 3 * 4 / 2"};

    }
}