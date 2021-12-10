package day09;

import java.util.Arrays;

public class MethodQuiz1 {



    static String[] foods = {"치킨", "파스타", "짬뽕"};

    //foods배열에 새로운 데이터를 끝에 추가하는 함수
    static void push(String newFood) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = newFood;
        foods = temp;
    }

    static int indexOf(String targetFood) {
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (targetFood.equals(foods[i])) {
                index = i;
                break;
            }
        }// end for
        return index;
    }

    public static void main(String[] args) {

        push("볶음밥");
        System.out.println(Arrays.toString(foods));

        push("라면");
        System.out.println(Arrays.toString(foods));

        System.out.println("============================");

        // 1리턴
        int idx = indexOf("파스타");
        System.out.println("idx = " + idx);

        // 3리턴
        int idx2 = indexOf("볶음밥");
        System.out.println("idx2 = " + idx2);

        // -1리턴
        int idx3 = indexOf("망고");
        System.out.println("idx3 = " + idx3);

        System.out.println("===============================");

        /*remove("볶음밥"); // foods배열에서 볶음밥 제거
        remove("망고"); // 존재하지 않는 음식명입니다 출력.

        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
        modify(2, "닭갈비");  // 2번 인덱스 데이터 닭갈비로 수정
        clear();  // foods배열 모든 데이터 삭제

        boolean flag = include("파스타"); // 파스타 발견시 true 리턴*/
    }
}
