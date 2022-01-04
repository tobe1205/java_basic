package day19.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListSearchQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        String[] tvxq = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        List<String> tvxq = new ArrayList<>(
                Arrays.asList("영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호")
        );

        System.out.println("* 변경 전 정보: " + tvxq);

        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.printf(">> ");
            String targetName = sc.next();

            //수정 여부 판단
            if (tvxq.contains(targetName)) {
                System.out.printf("%s의 별명을 변경합니다.\n", targetName);
                System.out.printf(">> ");
                String newName = sc.next();

                tvxq.set(tvxq.indexOf(targetName), newName);

                System.out.println("변경 완료!!");
                System.out.println("* 변경 후 정보: " + tvxq);
                break;
            } else {
                System.out.printf("%s은(는) 없는 이름입니다.\n", targetName);
            }
        }

    }
}