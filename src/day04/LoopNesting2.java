package day04;

import java.util.Scanner;

public class LoopNesting2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("정사각형을 그립니다.");
        System.out.println("높이는 얼마입니까? ");
        int height = sc.nextInt();

        sc. close();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");


        }

    }
}
