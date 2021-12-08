package day06;

import java.util.Arrays;

public class ArrayDelete {

    public static void main(String[] args) {

        //배열 중간데이터 삭제
        int[] arr = {1, 3, 5, 7, 9, 11};

        System.out.println("삭제 전: " + Arrays.toString(arr));

        int delIdx = 3;

        for (int i = delIdx; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }


        int[] temp = new int[arr.length - 1];

        for (int i = 0; i <temp.length ; i++) {
            temp[i] = arr[i];
        }
        arr = temp; temp = null;


        System.out.println("삭제 후: " + Arrays.toString(arr));

    } //end main
} //end class
