package day03;

import java.util.Scanner;

public class LoopQuiz01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }

        }

    }
}
