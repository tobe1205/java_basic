package day08;

import java.util.Scanner;

public class ScannerProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.print("문자: ");
        String s = sc.nextLine();

        System.out.print("s = " + s);

    }
}
