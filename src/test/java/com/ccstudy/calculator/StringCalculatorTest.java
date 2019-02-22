package com.ccstudy.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void 문자열을_줬을때_계산결과를_출력() {
        //given
        StringCalculator stringCalculator = new StringCalculator("2 + 3 - 1 * 3 / 2");
        //when
        int result = stringCalculator.calculate();
        //then
        assertEquals(result,6);
    }
}