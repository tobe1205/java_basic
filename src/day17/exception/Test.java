package day17.exception;

import java.util.InputMismatchException;

import static day17.exception.EasyScanner.*;

public class Test {

    public static void main(String[] args) {
        
        String name = inputStr("이름 : ");
        System.out.println("name = " + name);

        try {
            int age = inputInt("나이 : ");
            System.out.println("age = " + age);

            double height = inputDouble("신장 : ");
            System.out.println("height = " + height);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
