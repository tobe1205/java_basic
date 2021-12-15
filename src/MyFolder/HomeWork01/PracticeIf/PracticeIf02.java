package MyFolder.HomeWork01.PracticeIf;

import java.util.Scanner;

public class PracticeIf02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수: ");
        int num = sc.nextInt();
        sc.close();

        if (num == 0){
            System.out.println("입력하신 숫자는 0입니다.");
        }else if (num % 7 == 0){
            System.out.println("입력하신 숫자는 7의 배수입니다.");
        }else {
            System.out.println("입력하신 숫자는 7의 배수가 아닙니다.");

        }
    }
}
