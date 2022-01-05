package com.kh.practice.list.music.view;


import com.kh.practice.list.library.model.vo.Book;
import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

import java.util.*;

public class MusicView {

   Scanner sc = new Scanner(System.in);

    public MusicView() {
        mainMenu();
    }

    MusicController mc = new MusicController();


    private String input(String msg) {
        System.out.print(msg);
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
       while (true) {
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
                   addList();
                   break;
               case 2:
                   addAtZero();
                   break;
               case 3:
                   printAll();
                   break;
               case 4:
                   break;
               case 5:
                   break;
               case 6:
                   break;
               case 7:
                   break;
               case 8:
                   break;
               case 9:
                   System.out.println("프로그램을 종료합니다.");
                   System.exit(0);
               default:
                   System.out.println("1 ~ 9 까지의 숫자로 입력해주세요.");
           }
       }


   }

    private void printAll() {
        List<Music> music = mc.printAll();
        System.out.println("******* 전체 곡 목록 출력 *******");
            System.out.println(music);

    }


    //마지막 위치에 곡 추가 성공 메소드
    private void addList() {
        System.out.println("******* 마지막 위치에 곡 추가 *******");
        String title = input("곡 명 : ");
        String singer = input("가수 명 : ");

        Music music = new Music(title,singer);
        mc.addList(music);

        System.out.printf("\n[%s]곡이 추가 되었습니다.\n",title);

    }

    //첫번째 리스트에 객체 저장 메소드
    private void addAtZero() {
        System.out.println("******* 첫 위치에 곡 추가 *******");
        String title = input("곡 명 : ");
        String singer = input("가수 명 : ");

        Music music = new Music(title,singer);
        mc.addAtZero(music);

        System.out.printf("\n[%s]곡이 추가 되었습니다.\n",title);
    }


}
