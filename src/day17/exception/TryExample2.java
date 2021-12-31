package day17.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("정수1 : ");
            int n1 = sc.nextInt(); //warning


            System.out.print("정수2 : ");
            int n2 = sc.nextInt(); //warning

            int divRes = n1 / n2; //warning
            System.out.println("divRes = " + divRes);
        } catch (InputMismatchException e) {
            System.out.println("정수로만 입력하세요!");
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println("알 수 없는 예외 발생! 관리자에게 문의하세요!!");
        }

        System.out.println("프로그램 정상 종료!");
        sc.close();

    }
}
