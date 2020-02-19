package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpliterTest {

    @Test
    void getNumberArr() {
    }

    @Test
    void getOperatorArr() {
    }

    @Test
    void testOperator(String operator){
        int toInt;
        try{
            toInt = Integer.parseInt(operator);
            System.out.println(toInt);
        }
        catch(Exception notNumber){
            System.out.println("숫자 아님");
        }
    }
}