package calculator;
import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        System.out.println("input : ");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        if(isBlank(value)){
            System.out.println("Input right value");
            System.exit(0);
        }
        Spliter spliter = new Spliter(value);
        Calculator calculator = new Calculator(spliter.getOperatorArr(),spliter.getNumberArr());
        System.out.println(calculator.getResult());

    }

    private static boolean isBlank(String value){
        return value == null || value.isEmpty();
    }



}
