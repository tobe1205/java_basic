package day08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RouletteAnswer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("게임 인원 (2 ~ 4명) ==> ");
        int playerNum = sc.nextInt();

        //인원 수 검증
        if (playerNum < 2 || playerNum > 4) {
            System.out.println("인원 수가 올바르지 않습니다. GAME OVER!");
            return;
        }

        //참여 인원 수대로 이름을 반복 입력 받은 후 배열에 저장
        String[] players = new String[playerNum];
        System.out.println("\n플레이어 이름을 등록합니다.");
        for (int i = 0; i < playerNum; i++) {
            System.out.printf("%d번 플레이어 이름 : ", i+1);
            players[i] = sc.next();
        }
        //참여 인원 이름 출력
        System.out.println(Arrays.toString(players) + " 참가! ");

        System.out.printf("\n실탄 개수 (1 ~ 5개) ==> ");
        int bulletNum = sc.nextInt();

        //총에 실탄수만큼 총알을 배치해야 함. (공간 6개)
        boolean[] magazine = new boolean[6];

        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");

        Random r = new Random();

        int success = 0; //정확하게 총알을 장전한 횟수
        while (true) {
            //입력된 실탄 수만큼 탄창배열의 내부값을 랜덤하게 true로 바꿔야 함.
            int position = r.nextInt(magazine.length);
            if (!magazine[position]) { //탄창안에 실탄이 안들어간 곳에만
                magazine[position] = true; //총알을 넣어라
                success++;
            }
            if (success == bulletNum) break;
        }

//        System.out.println("탄창: " + Arrays.toString(magazine));

        // ======== 핵심 게임 로직 ========= //
        // 선턴 플레이어 랜덤 결정
        // 랜덤 인덱스를 플레이어 수 범위 안에서 결정
        int turn = r.nextInt(playerNum);

        System.out.printf("\n총을 돌렸습니다. %s부터 시작합니다.\n", players[turn]);

        while (true) {
            /*
              # 1턴동안 해야할 일
              1. 탄창을 회전시켜서 무작위로 격발구의 위치를 결정
               : 랜덤 인덱스(탄창범위 0~5) 생성
              2. 격발한다: 위에서 나온 인덱스로 탄창을 조회하여 실탄이 있는지 확인
              3. 사망 판정: 해당 위치에 실탄이 있었다면(값이  true였다면)
                            사망 처리 후 게임 종료, 없었다면 다음 턴으로 이동
              4. 턴 조정: 지금 격발한 플레이어가 마지막 인덱스 플레이어면
                           다음 턴은 0번으로 조정, 아니면 ++로 처리
            */
        }
    }
}





