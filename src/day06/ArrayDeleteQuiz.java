/*
package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

    public static void main(String[] args) {

        String[] students = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 우리반 학생들의 별명: " + Arrays.toString(students));


        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 학생의 별명을 입력하세요!");
        System.out.print("> ");
        String name = sc.next();
        sc.close();

        int index = -1; //찾은 인덱스를 저장할 변수
        for (int i = 0; i < students.length; i++) {
            if (name.equals(students[i])) {
                index = i;
                break;
            }
        }
        int delInx = index;

        for (int i = delInx; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }
        String[] temp = new String[students.length - 1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = students[i];

        }
         students = temp; temp = null;

    }
}
}*/
