package day18.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("주민번호 : ");
        String num = sc.next();

        System.out.printf("앞자리 : %s\n", num.substring(0, 6));
        System.out.printf("뒷자리 : %s\n", num.substring(7));

        int year = Integer.parseInt(num.substring(0, 2));
        int month = Integer.parseInt(num.substring(2,4));
        int day = Integer.parseInt(num.substring(4,6));

        char genNum = num.charAt(7);

        String gender = (genNum == '1' || genNum == '3') ? "남자" : "여자";


        int birthYear = (genNum == '1'|| genNum == '2') ? 1900 + year : 2000 + year;
        int age = LocalDateTime.now().getYear() - birthYear + 1;

        System.out.printf("%d년도 %d월 %d일생 %d세 %s", birthYear, month, day, age, gender);

        sc.close();
    }

}
