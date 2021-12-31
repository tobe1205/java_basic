package day17.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//쉽게쓰는 스캐너
public class EasyScanner {

    private static Scanner sc = new Scanner(System.in);

    //문자열 입력 기능
    public static String inputStr(String message)  {
        System.out.print(message);
        String str = sc.nextLine();
        return str;
    }
    //정수 입력 기능
    public static int inputInt(String message)throws InputMismatchException{
        System.out.print(message);
        int i = sc.nextInt();
        sc.nextLine();
        return i;
    }
    //실수 입력 기능
    public static double inputDouble(String message) throws InputMismatchException{
        System.out.print(message);
        double d = sc.nextDouble();
        sc.nextLine();
        return d;
    }
}
