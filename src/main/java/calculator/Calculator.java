package calculator;

public class Calculator {

    //부호를 검증하고, 그에 맞는 함수를 호출하는 함수.
    public int callVal(String[] a,int[] b){
        int result = b[0];
        for(int i = 0 ; i < a.length ; i++){
            if(a[i].equals("+")){
                result = plus(result,b[i+1]);
            }
            if(a[i].equals("-")){
                result = minus(result,b[i+1]);
            }
            if(a[i].equals("*")){
                result = multi(result,b[i+1]);
            }
            if(a[i].equals("/")){
                result = divide(result,b[i+1]);
            }

        }
        return result;

    }


    public int plus(int a, int b)
    {
        return a+b;
    }

    public int divide(int a, int b)
    {
        return a/b;
    }

    public int minus(int a, int b){
        return a-b;
    }

    public int multi(int a, int b)
    {
        return a*b;
    }
}
