package day06;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        int[] arr = {50, 150, 200, 250, 300};

        System.out.println("추가 전: " + Arrays.toString(arr));

        int newNumber = 100; //신규 삽입데이터
        int targetIndex = 1; // 삽입위치

        //1. 사이즈가 하나 더 큰 배열 생성
        int[] temp = new int[arr.length + 1];
        //2. 기존 데이터를 전부 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        //3. 끝데이터부터 뒤로 밀기
        for (int i = temp.length-1; i > targetIndex; i--) {
            temp[i] = temp[i - 1];
        }
        //4. 타겟인덱스에 데이터 추가
        temp[targetIndex] = newNumber;
        //5. 주소변경
        arr = temp; temp = null;

        System.out.println("추가 후: " + Arrays.toString(arr));
    }
}

