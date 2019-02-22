package com.ccstudy.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTypeTest {

    @Test
    public void 더하기_토큰을_줬을때_더하기_전략이_나온다() {
        //given
        //when
        CalculatorStrategy calculatorStrategy = CalculatorType.findByToken("+");
        //then
        assertEquals(calculatorStrategy.calculate(1,2),3);
    }

    @Test
    public void 빼기_토큰을_줬을때_빼기_전략이_나온다() {
        //given
        //when
        CalculatorStrategy calculatorStrategy = CalculatorType.findByToken("-");
        //then
        assertEquals(calculatorStrategy.calculate(1,2),-1);
    }

    @Test
    public void 곱하기_토큰을_줬을때_곱하기_전략이_나온다() {
        //given
        //when
        CalculatorStrategy calculatorStrategy = CalculatorType.findByToken("*");
        //then
        assertEquals(calculatorStrategy.calculate(2,2),4);
    }

    @Test
    public void 나누기_토큰을_줬을때_나누기_전략이_나온다() {
        //given
        //when
        CalculatorStrategy calculatorStrategy = CalculatorType.findByToken("/");
        //then
        assertEquals(calculatorStrategy.calculate(2,2),1);
    }
}