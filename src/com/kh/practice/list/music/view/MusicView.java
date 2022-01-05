package com.kh.practice.list.music.view;


import com.kh.practice.list.music.controller.MusicController;

import java.util.*;

public class MusicView {

   Scanner sc = new Scanner(System.in);

   MusicController mu = new MusicController();


    private String input(String msg) {
        System.out.printf(msg);
        return sc.nextLine();
    }

    //문자열 -> 정수 변환 메서드
    private int toInteger(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("# 정수형 숫자로만 입력하세요!");
            return 0;
        }
    }

   public void mainMenu(){
       System.out.println("******* 메인 메뉴 *******");
       System.out.println("1. 마지막 위치에 곡 추가");
       System.out.println("2. 첫 위치에 곡 추가");
       System.out.println("3. 전체 곡 목록 출력");
       System.out.println("4. 특정 곡 검색");
       System.out.println("5. 특정 곡 삭제");
       System.out.println("6. 특정 곡 정보 수정");
       System.out.println("7. 곡명 오름차순 정렬");
       System.out.println("8. 가수명 내림차순 정렬");
       System.out.println("9. 종료");
       int menu = toInteger(input("메뉴 번호 선택 : "));

       switch (menu) {
           case 1:
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
           case 7:
           case 8:
           case 9:
           default:
       }



   }

}
