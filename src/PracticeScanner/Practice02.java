package PracticeScanner;

import java.util.Scanner;

public class Practice02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.next();
        System.out.print("나이: ");
        int age = sc.nextInt();
        sc.close();

        System.out.println("--------------");
        System.out.printf("이름: %s\n", name);
        System.out.printf("출생년도: %d년생", (2021 - age)+1);
    }
}
