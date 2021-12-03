package day03;

import java.util.Scanner;

public class Loop01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요: ");
        int n = sc.nextInt();
        sc.close();

        /*
        for (int i = n; i >= 0; i--){
            System.out.printf("%d ", i);
        }*/
        for (int i = 1; i <= n; i++){
            System.out.printf("%d ", i);
        }
    }
}
