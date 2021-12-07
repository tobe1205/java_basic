package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {

    public static void main(String[] args) {
        //문자열끼리의 동등비교 시 ==을 사용하지 말고
        //문자열 1. equals(문자열2) 를 사용할 것!
        // ex) if (s1 == s2) (x)
        //     if(s1.equals(s2)) (o)

        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");

        Scanner sc = new Scanner(System.in);

        String[] foodList = {};

        while(true) {

            System.out.print(">> ");
            String newFood = sc.nextLine();

            if (newFood.equals("그만")) {
                break;
            }

            String[] temp = new String[foodList.length + 1];

            for (int i = 0; i < foodList.length; i++) {
                temp[i] = foodList[i];
            }
            temp[temp.length - 1] = newFood;
            foodList = temp;
            temp = null;
        }
            System.out.println("먹고싶은 음식: " + Arrays.toString(foodList));
            sc.close();
    }
}
