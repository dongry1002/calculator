package calculator;


import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        System.out.println("input : ");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        isBlank(value);

        int[] numberArr = Spliter.splitNumbers(value);
        String[] operatorArr = Spliter.splitOperator(value);
        Calculator calculator = new Calculator();
        System.out.println(calculator.callVal(operatorArr,numberArr));

    }

    public static void isBlank(String value){
        if(value != null && value != " " ){
            return;
        }

        throw new IllegalArgumentException("Input right value");
    }



}
