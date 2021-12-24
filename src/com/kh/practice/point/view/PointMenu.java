package com.kh.practice.point.view;

import java.util.Scanner;

public class PointMenu {

    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        System.out.println("===== 메뉴 =====");
        System.out.println("1. 원");
        System.out.println("2. 사각형");
        System.out.println("9. 끝내기");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                circleMenu();
                break;
            case 2:
                break;
            case 9:
                System.out.println("종료합니다.");
                System.exit(0); //프로그램 종료 메서드
                break;
            default:
                break;

        }
    }

    private void circleMenu() {
        System.out.println("===== 원 메뉴 =====");
        System.out.println("1. 원 둘레");
        System.out.println("2. 원 넓이");
        System.out.println("9. 메인으로");

        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                break;
            case 2:
                break;
            case 9:
                break;
            default:
                break;

        }
    }

}
