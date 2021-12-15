package MyFolder.HomeWork01.PracticeWhile;

import java.util.Scanner;

public class PracticeWhile01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 1: ");
        int num1 = sc.nextInt();
        System.out.print("정수 2: ");
        int num2 = sc.nextInt();
        sc.close();

        int total = 0;
        int n = num1;
        while (n <= num2){
            total += n;
            n++;
        }
        System.out.printf("%d~%d까지의 총합: %d",num1, num2, total);
    }
}
