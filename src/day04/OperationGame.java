package day04;

import java.util.Random;
import java.util.Scanner;

public class OperationGame {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int level = 0;

        System.out.println("~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~");
        System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요 ~]");
        System.out.println("====================================");
        System.out.println("~~~~~~~~~~난이도를 설정합니다. ~~~~~~~~~");
        System.out.println("[ 1. 상 (1~100) | 2. 중 (1~50) | 3. 하 (1~20)");
        System.out.print(">> ");
        int choice = sc.nextInt();

        if (choice == 1){
            level = 100;
            System.out.println("난이도 상을 선택하셨습니다.");
        } else if (choice == 2){
            level = 50;
            System.out.println("난이도 중을 선택하셨습니다.");
        } else if (choice == 3){
            level = 20;
            System.out.println("난이도 하를 선택하셨습니다.");
        } else {
            System.out.println("잘못 입력하셨으므로 난이도 하로 조정됩니다.");
            level = 20;
        }

        int qNum = 1;
        int ok = 0;
        int no = 0;

        while (true) {

            int first = r.nextInt(level)+1;
            int second = r.nextInt(level)+1;

            int real = 0;

            String mark = "";

            int markNum = r.nextInt(3)+1;

            if (markNum == 1){
                mark = "+";
                real = first + second;

            }else if (markNum == 2){
                mark = "-";
                if (first == second){
                    second -= 1;
                }
                if (first < second){
                    int temp = 0;
                    temp = first;
                    first = second;
                    second = temp;
                }
                real = first - second;
            }else{
                mark = "x";
                real = first * second;
            }


            System.out.printf("Q%d. %d %s %d = ??\n", qNum, first, mark, second);
            qNum+= 1;
            System.out.print(">> ");
            int answer = sc.nextInt();

            if (answer == 0) break;

            if (answer == real) {
                System.out.println("정답입니다!");
                ok += 1;
            } else {
                System.out.println("틀렸습니다!");
                no += 1;
            }
            }
        System.out.println("게임을 종료합니다.");
        System.out.println("========================");
        System.out.printf("정답횟수: %d회, 틀린횟수: %d회",ok,no);
        sc.close();
        }
    }
