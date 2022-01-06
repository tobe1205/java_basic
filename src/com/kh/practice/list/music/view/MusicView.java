package com.kh.practice.list.music.view;


import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

import java.util.*;

public class MusicView {

    Scanner sc = new Scanner(System.in);


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

    //메인메뉴 메소드
    public void mainMenu() {
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
                    searchMusic();
                    break;
                case 5:
                    deleteMusic();
                    break;
                case 6:
                    setMusic();
                    break;
                case 7:
                    ascTitle();
                    break;
                case 8:
                    descSinger();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("1 ~ 9 까지의 숫자로 입력해주세요.");
            }
        }


    }


    //마지막 위치에 곡 추가 성공 메소드
    private void addList() {
        System.out.println("******* 마지막 위치에 곡 추가 *******");
        String title = input("곡 명 : ");
        String singer = input("가수 명 : ");

        Music music = new Music(title, singer);
        mc.addList(music);

        System.out.printf("\n[%s]곡이 추가 되었습니다.\n", title);

    }

    //첫번째 리스트에 객체 저장 메소드
    private void addAtZero() {
        System.out.println("******* 첫 위치에 곡 추가 *******");
        String title = input("곡 명 : ");
        String singer = input("가수 명 : ");

        Music music = new Music(title, singer);
        mc.addAtZero(music);

        System.out.printf("\n[%s]곡이 추가 되었습니다.\n", title);
    }

    //모든 리스트 출력 메소드
    private void printAll() {
        mc.printAll();
        System.out.println(mc.printAll());

    }

    //특정 곡 검색 메소드
    private void searchMusic() {
        System.out.println("******* 특정 곡 검색 *******");
        String title = input("검색할 곡 명 : ");
        Music music = mc.searchMusic(title);
        if (music != null) {
            System.out.println(music);
        } else {
            System.out.println("검색한 곡이 없습니다.");
        }
    }

    //특정 곡 삭제 메소드
    private void deleteMusic() {
        System.out.println("******* 특정 곡 삭제 *******");
        String title = input("삭제할 곡 명 : ");
        Music music = mc.removeMusic(title);
        if (music == null) {
            System.out.println("검색한 곡이 없습니다.");
        } else {
            System.out.printf("%s - %s을(를) 삭제했습니다.\n", music.getTitle(), music.getSinger());
        }

    }

    //특정 곡 정보 수정 메소드
    private void setMusic() {
        System.out.println("******* 특정 곡 수정 *******");
        String title = input("검색할 곡 명 : ");
        Music music = mc.searchMusic(title);
        if (music == null) {
            System.out.println("검색한 곡이 없습니다.");
        } else {
            String newTitle = input("수정할 곡 명 : ");
            String newSinger = input("수정할 가수 명 : ");
            Music newMusic = new Music(newTitle, newSinger);
            Music modifyMusic = mc.setMusic(title, newMusic);
        }
    }
    //곡명 오름차순 정렬 메소드
    private void ascTitle() {
        mc.ascTitle();
        System.out.println("정렬에 성공했습니다.");
    }
    //가수명으로 내림차순 정렬 메소드
    private void descSinger() {
        mc.descSinger();
        System.out.println("정렬에 성공했습니다.");
    }

}
