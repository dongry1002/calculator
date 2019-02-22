package com.ccstudy.calculator;


import java.util.*;

public class StringCalculator {
    private List<String> checkList = Arrays.asList("+", "-", "*", "/");
    private List<String> operatorGroup = new ArrayList<>();
    private Queue<Integer> numbers = new LinkedList<>();

    public StringCalculator(String text) {
        parse(text);
    }

    private void parse(String text) {
        String[] splitText = text.split(" ");

        for (String s : splitText) {
            addToken(s);
        }
    }

    private void addToken(String token) {
        if (checkList.contains(token)) {
            operatorGroup.add(token);
            return;
        }
        numbers.add(Integer.parseInt(token));
    }

    public int calculate() {
        int result = numbers.remove();

        for (String operator : operatorGroup) {
            result = CalculatorType.findByToken(operator).calculate(result, numbers.remove());
        }
        return result;
    }
}
