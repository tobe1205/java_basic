package LoopQuiz;

import java.util.Scanner;

public class LoopQuiz03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수를 입력하세요: ");
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {

            System.out.println(sb.append(sc.next()).reverse());
            sb.setLength(0);

        }
        }
    }
