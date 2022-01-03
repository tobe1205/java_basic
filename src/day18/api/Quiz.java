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

        char genNum = num.charAt(7);
        int year = Integer.parseInt(num.substring(0, 2));


        int birthYear = (genNum == '1' || genNum == '2') ?
        } else if (genNum == '3' || genNum == '4')
            year4 = 2000 + year2;
        int year = LocalDateTime.now().getYear() - year4;
        System.out.printf("%d년도 %d월 %d일생 %d세 %s", year, month, day, age, gender);

    }


}
