package HomeWork01.PracticeScanner;

import java.util.Scanner;

public class Practice01 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("얼마 있어요??");
        int price = sc.nextInt();

        sc.close();

        if (price >= 5000){
            System.out.println("선택된 음식: 김치찌개");
        } else if (price >= 2500){
            System.out.println("선택된 음식: 라면");
        } else if (price == 0) {
            System.out.println("선택된 음식: 굶어!");
        }

    }
}
