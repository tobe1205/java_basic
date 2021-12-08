package HomeWork01.ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverseQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numList = {};
        int qNum = 0;

        while (true) {
            System.out.printf("x[%d]: ", qNum);
            int numbers = sc.nextInt();
            qNum++;

            int[] temp = new int[numList.length + 1];

            for (int i = 0; i < numList.length; i++) {
                temp[i] = numList[i];
            }
            temp[temp.length - 1] = numbers;
            numList = temp;
            temp = null;

            if (numList.length > 6) break;
        }
        System.out.println("반전했습니다.");

        int[] reverseList = new int[numList.length];

        for (int i = numList.length-1, j = 0; i >= 0; i--,j++) {
            reverseList[j] = numList[i];

        }
        for (int i = 0; i < numList.length; i++) {
            System.out.printf("x[%d]: %d\n",i,reverseList[i]);
        }
        System.out.println("숫자 리스트: " + Arrays.toString(numList));
        System.out.println("숫자 리버스: " + Arrays.toString(reverseList));
        sc.close();
    } //end main
} //end class