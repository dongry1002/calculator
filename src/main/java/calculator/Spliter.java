package calculator;


public class Spliter {
    private static final String DELIMITER = " ";
    private int[] numberArr;
    private String[] operatorArr;
    private Calculator calculator;
//    setter는
//    testcode는 private인 걸 못짬.
//    return이 void이면 test를 못함.

    //생성자로 바꾸기.
    //number_arr와 sign_arr를 class로 뽑던지, 세분화
    //void type function을 쓰지 않는 것이 좋음.
    //validation check
    Spliter(String value) {
        String[] splitedValue = value.split(DELIMITER);
        numberArr = splitNumbers(splitedValue);
        operatorArr = splitOperator(splitedValue);
        callCalculator();
    }

    private void callCalculator() {
        calculator = new Calculator(operatorArr, numberArr);
    }

    private int[] splitNumbers(String[] splitedValue){
        numberArr = new int[getAnNumberIndex(splitedValue)];
        int numberIndex = 0;
        for (int i = 0; i < splitedValue.length; i+=2) {
            checkValidity(isRightNumber(splitedValue[i]), "Input valid value");
            numberArr[numberIndex++] = Integer.parseInt(splitedValue[i]);
        }
        return numberArr;
    }

    private boolean isRightNumber(String number) {
        //수정수정
        return false;
    }

    private void checkValidity(boolean rightOperator, String errorMessage) {
        if (rightOperator) {//부호
            System.out.println(errorMessage);
            System.exit(0);
        }
    }

    private int getAnNumberIndex(String[] splitedValue) {
        return (getOperatorIndex(splitedValue)) + 1;
    }

    //Exception Controll. operator와 number
    private String[] splitOperator(String[] splitedValue){
        operatorArr = new String[getOperatorIndex(splitedValue)];
        int operatorIndex = 0;
        for (int i = 1; i < splitedValue.length; i+=2) {
            checkValidity(!isRightOperator(splitedValue[i]), "Use right operator");
            operatorArr[operatorIndex++] = splitedValue[i];
        }
        return operatorArr;
    }

    private static boolean isRightOperator(String operator){
        return "+".equals(operator)||"-".contains(operator)||"*".equals(operator)||"/".equals(operator);
    }

    private int getOperatorIndex(String[] splitedValue) {
        return splitedValue.length / 2;
    }

    public String toString(){{
        return this.calculator.getResult()+"";
    }
    }

}