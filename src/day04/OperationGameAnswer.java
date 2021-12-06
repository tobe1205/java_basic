package day04;

import java.util.Scanner;

public class OperationGameAnswer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("~~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~~");
        System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요~]");

        System.out.println("# 엔터를 누르면 시작합니다.");
        System.out.println("=============================");
        sc.nextLine();

        int max = 0;

        boolean flag = false;
        while (!flag) {
            System.out.println("\n# 난이도를 입력하세요! [상, 중, 하]");
            System.out.print(">> ");
            String gameLevel = sc.next();

            //입력한 난이도값을 기반으로 max를 결정
            switch (gameLevel) {
                case "상":
                    max = 1000;
                    System.out.println("상급 난이도입니다. 1 ~ 1000 범위로 출제됩니다.");
                    flag = true;
                    break;
                case "중":
                    max = 100;
                    System.out.println("중급 난이도입니다. 1 ~ 100 범위로 출제됩니다.");
                    flag = true;
                    break;
                case "하":
                    max = 20;
                    System.out.println("하급 난이도입니다. 1 ~ 20 범위로 출제됩니다.");
                    flag = true;
                    break;
                default:
                    System.out.println("난이도를 잘못 입력했습니다. 다시 입력하세요.");
                    flag = false;
            }
        }

        int qNum = 1; //문제번호 변수

        //정, 오답 횟수 저장 변수
        int correctCnt = 0, wrongCnt = 0;

        while (true) {
            int first = (int) (Math.random() * max + 1);
            int second = (int) (Math.random() * max + 1);

            //실제 정답
            int realAnswer = 0;
            //연산 부호
            String mark = "";
            //랜덤 정수 0, 1, 2를 생성해서 부호를 결정
            int markRn = (int) (Math.random() * 3);

            //랜덤 정수 값에 따라 연산부호를 결정하고 실제정답을 세팅
            switch (markRn) {
                case 0:
                    mark = "+";
                    realAnswer = first + second;
                    break;
                case 1:
                    mark = "-";

                    //만약 두 수가 같다면
                    if (first == second) {
                        second--;
                    }

                    //뒷 숫자가 앞 숫자보다 크면 두값을 교체
                    if (first < second) {
                        int temp = first;
                        first = second;
                        second = temp;
                    }

                    realAnswer = first - second;
                    break;
                case 2:
                    mark = "x";
                    realAnswer = first * second;
                    break;
            }

            System.out.printf("\nQ%d) %d %s %d = ?\n",
                    qNum++, first, mark, second);

            //사용자의 입력답
            System.out.print(">> ");
            int userAnswer = sc.nextInt();

            //탈출 조건
            if (userAnswer == 0) break;

            //정답 검증
            if (realAnswer == userAnswer) {
                System.out.println("# 정답입니다!");
                correctCnt++;
            } else {
                System.out.println("# 틀렸습니다!");
                wrongCnt++;
            }
        }//end while true

        //프로그램 종료 시점
        System.out.println("==============================");
        System.out.printf("# 정답 횟수: %d회, 오답 횟수: %d회\n"
                , correctCnt, wrongCnt);
        sc.close();

    }
}