package calculator;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorApplication {
public static void main(String[] args) {
    System.out.println("input : ");
    Scanner scanner = new Scanner(System.in);
    String value = scanner.nextLine();

    Spliter spliter = new Spliter();
    spliter.input_spliter(value);

    Calculator calculator = new Calculator();
    System.out.println(calculator.callVal(spliter.sign_arr,spliter.number_arr));

    }


}
