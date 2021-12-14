package day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    static void remove(String newFood) {

        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (newFood.equals(foods[i])) {
                index = i;
                break;
            }
        }
//        System.out.println(index);
//        System.out.println(Arrays.toString(foods));
        if (index != -1) {
            for (int i = index; i < foods.length - 1; i++) {
                foods[i] = foods[i + 1];
            }
            String[] temp = new String[foods.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = foods[i];
            }
            foods = temp;
        } else {
            System.out.printf("%s는 존재하지 않는 음식입니다.\n", newFood);
        }
    }

    static void insert(int targetIdx, String newName) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        for (int i = temp.length - 1; i > targetIdx; i--) {
            temp[i] = temp[i - 1];
        }
        temp[targetIdx] = newName;
        foods = temp;
        temp = null;
    }

    static void modify(int targetIndex, String changeName) {

        String[] temp = new String[foods.length];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[targetIndex] = changeName;
        foods = temp;
    }

    static void clear(){
        foods = new String[0];
    }

    static boolean include(String findName){

        boolean result = false;

        for (int i = 0; i < foods.length; i++) {
            if(findName.equals(foods[i])){
                result = true;
                break;
            }
        }
        return result;
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

        remove("볶음밥");
        printArray(foods);// foods배열에서 볶음밥 제거
        remove("망고"); // 존재하지 않는 음식명입니다 출력.
//        System.out.println(Arrays.toString(foods));// foods배열에서 볶음밥 제거

        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
        System.out.println(Arrays.toString(foods));
        modify(2, "닭갈비");  // 2번 인덱스 데이터 닭갈비로 수정
        System.out.println(Arrays.toString(foods));
/*        clear();  // foods배열 모든 데이터 삭제
        System.out.println(Arrays.toString(foods));*/

        boolean flag = include("파스타"); // 파스타 발견시 true 리턴
        System.out.println(flag);
    }

    private static void printArray(String[] foods) {
        System.out.println(Arrays.toString(MethodQuiz1.foods));
    }
}
