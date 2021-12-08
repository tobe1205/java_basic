package day06;

import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {

        // 순차 탐색 알고리즘
        Scanner sc = new Scanner(System.in);

        System.out.print("찾은 음식: ");
        String targetFood = sc.next();
        sc.close();

        String[] foods = {"치킨", "피자", "삼겹살", "족발", "파스타"};

        int index = -1; //찾은 인덱스를 저장할 변수
        for (int i = 0; i < foods.length; i++) {
            if (targetFood.equals(foods[i])) {
                index = i;
                break;
            } //end for
        }
        boolean result = index != -1;
        System.out.println("음식 탐색 성공??" + result);
        System.out.println("찾은 음식의 인덱스: "+ index);
    }//end main
}//end class
