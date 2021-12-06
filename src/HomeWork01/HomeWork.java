package HomeWork01;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*System.out.println("양의 정수를 입력하세요: ");
        int n = sc.nextInt();
        sc.close();

        if (n >= 0 ) {
            System.out.printf(" %d을(를) 거꾸로 읽으면 ", n);
            for (int i = n; i > 0; i/=10) {
            System.out.printf("%d", i % 10);

            }
        } else {
            System.out.println("양의 정수만 입력해주세요.");
        }*/

        /*System.out.println("양의 정수를 입력하세요: ");
        int n = sc.nextInt();
        sc.close();

        int initN = n;
        int digitCount = 0; // 자리수를 저장할 변수

        while (n > 0) {
            n/= 10;
            digitCount++;
        }
        System.out.printf("%d은(는) %d자리입니다.", initN, digitCount );*/

       /* System.out.println("양의 정수를 입력하세요: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n ; i++) {
            System.out.printf("%d", i % 10);

        }*/

        System.out.println("몇 개의 *을 출력할까요: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i < n; i++) {
            System.out.print("*");
            if (i % 5 == 0) {
                System.out.println("\n");
            }
        }
    }
}
