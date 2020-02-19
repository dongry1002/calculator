package calculator;

public class Calculator {
    private int result;
    private int nextvalue = 1;
    Exception invalidValue = new Exception("사칙연산자만 입력하세요");

    //부호를 검증하고, 그에 맞는 함수를 호출하는 함수.
    //변수명 만들기.(축약하지 않기)
    //Exception handle
    //Null Pointer Exception 발생할 여지를 줄이기 : "+".equals(a[i])
    //존재가 확실한 것을 앞으로 빼는 것이 좋다.
    //+,-,*,/ 를 상수로 빼는 것도 좋음 -> Enum으로 바꿀 수도 있음.
    Calculator(String[] operatorArr,int[] intArr){
        result = intArr[0];
        result = callVal(operatorArr,intArr);
    }
    
    private int callVal(String[] operatorArr,int[] intArr){
        for(int i = 0 ; i < operatorArr.length ; i++){
            result = CalculateValue(operatorArr[i], intArr);
        }
        return result;

    }

    private int CalculateValue(String operator, int[] intArr) {
        if("+".equals(operator)){
            return plus(result,intArr[nextvalue++]);
        }
        if("-".equals(operator)){
            return minus(result,intArr[nextvalue++]);
        }
        if("*".equals(operator)){
            return multi(result,intArr[nextvalue++]);
        }
        if("/".equals(operator)){
            return divide(result,intArr[nextvalue++]);
        }
        System.out.println(this.invalidValue.getMessage());
        return 0; //수정 필요
    }

    public int getResult(){
        return result;
    }

    private int plus(int left, int right)
    {
        return left+right;
    }

    private int divide(int left, int right)
    {
        return left/right;
    }

    private int minus(int left, int right){
        return left-right;
    }

    private int multi(int left, int right)
    {
        return left*right;
    }
}
