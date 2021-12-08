package day06;

import java.util.Arrays;

public class ArrayPop {

    public static void main(String[] args) {

        //배열의 맨 끝 데이터 삭제
        int[] arr = {10, 20, 30, 40};

        //크기가 기존보다 1개 작은 새로운 배열 생성
        int[] temp = new int[arr.length -1];

        //맨 마지막 데이터를 제외한 나머지를 새로운 배열로 복사
        for (int i = 0; i < temp.length ; i++) {
            temp[i] = arr[i];
        }
        arr = temp; temp = null;
        System.out.println(Arrays.toString(arr));
    }
}
