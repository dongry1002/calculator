package com.ccstudy.calculator;

import java.util.Arrays;

public enum CalculatorType {
    PLUS("+",(x, y) -> x + y),
    SUBTRACT("-",(x, y) -> x - y),
    MULTIPLY("*",(x, y) -> x * y),
    DIVISION("/",(x, y) -> x / y),
    EMPTY("없음",null);

    private String token;
    private CalculatorStrategy calculatorStrategy;

    CalculatorType(String token,CalculatorStrategy calculatorStrategy) {
        this.token = token;
        this.calculatorStrategy = calculatorStrategy;
    }

    public static CalculatorStrategy findByToken(String token){
        return Arrays.stream(CalculatorType.values())
                        .filter(calculatorType ->  calculatorType.isEqualToken(token))
                        .findAny()
                        .orElse(EMPTY)
                        .calculatorStrategy;
    }

    private boolean isEqualToken(String token){
        return this.token.equals(token);
    }
}
