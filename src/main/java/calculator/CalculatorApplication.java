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
        if(isBlank(value)){
            System.out.println("Input right value");
            System.exit(1);
        }
        Spliter spliter = new Spliter(value);
        System.out.println(spliter);

    }

    private static boolean isBlank(String value){
        return value == null || value.isEmpty();
    }



}
