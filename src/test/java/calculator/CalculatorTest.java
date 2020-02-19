package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CalculatorTest {

    @DisplayName("계산 결과값 점검")
    @Test
    void calcualteValueTest(){
//        2 + 3 * 4 / 2 - 2
        String[] operatorArr = {"+","*","/","-"};
        int[] numberArr = {2,3,4,2,2};
        Calculator calculator = new Calculator(operatorArr,numberArr);
        assertThat(calculator.getResult()).isEqualTo(8.0);


    }

}