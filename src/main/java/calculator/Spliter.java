package calculator;


public class Spliter {
     public static final String DELIMITER =" ";

    public static int[] splitNumbers(String value) {
        String[] splitedValue = value.split(DELIMITER);
        int[] numberArr = new int[getAnNumberIndex(splitedValue)];
        int numberIndex = 0;
        for (int i = 0; i < splitedValue.length; i += 2) {
            numberArr[numberIndex++] = checkValidity(splitedValue[i]);
        }
        return numberArr;
    }

    public static int checkValidity(String stringToInt) {
        int toInt = 0;
        try {
            toInt = Integer.parseInt(stringToInt);
        } catch (IllegalArgumentException parseFail) {
            System.out.println("숫자를 입력하시오");
        }

        return toInt;
    }


    private static int getAnNumberIndex(String[] splitedValue) {
        return (getOperatorIndex(splitedValue)) + 1;
    }


    //Exception Controll. operator와 number
    public static String[] splitOperator(String value) {
        String[] splitedValue = value.split(DELIMITER);
        String[] operatorArr = new String[getOperatorIndex(splitedValue)];
        int operatorIndex = 0;
        for (int i = 1; i < splitedValue.length; i += 2) {
            isRightOperator(splitedValue[i]);
            operatorArr[operatorIndex++] = splitedValue[i];
        }
        return operatorArr;
    }

    public static void isRightOperator(String operator) {
       if( "+".equals(operator) || "-".equals(operator) || "*".equals(operator) || "/".equals(operator)) {
           return ;
       }else
           throw new IllegalArgumentException("사칙 연산자를 입력하세요.");
    }

    private static int getOperatorIndex(String[] splitedValue) {
        return splitedValue.length / 2;
    }

}