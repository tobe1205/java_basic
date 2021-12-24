package com.kh.practice.point.view;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

import java.util.Scanner;

public class PointMenu {

    Scanner sc = new Scanner(System.in);
    CircleController cc = new CircleController();
    RectangleController rc = new RectangleController();

    public void mainMenu(){
        while (true) {
            System.out.println("===== 메뉴 =====");
            System.out.println("1. 원");
            System.out.println("2. 사각형");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    circleMenu();
                    break;
                case 2:
                    rectangleMenu();
                    break;
                case 9:
                    System.out.println("종료합니다.");
                    System.exit(0); //프로그램 종료 메서드
                    break;
                default:
                    break;

            }
        }
    }


    private void circleMenu() {
        System.out.println("===== 원 메뉴 =====");
        System.out.println("1. 원 둘레");
        System.out.println("2. 원 넓이");
        System.out.println("9. 메인으로");
        System.out.print("메뉴 번호 : ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                calcCircum();
                break;
            case 2:
                calcArea();
                break;
            case 9:
                System.out.println("메인으로 돌아갑니다.");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;

        }
    }
//원 둘레 구하는 함수
    private void calcArea() {
        System.out.print("x 좌표 : ");
        int inputX = sc.nextInt();
        System.out.print("y 좌표 : ");
        int inputY = sc.nextInt();
        System.out.print("반지름 : ");
        int inputRadius = sc.nextInt();
        String print = cc.calcArea(inputX,inputY,inputRadius);
        System.out.println(print);

    }
//원 넓이 구하는 함수
    private void calcCircum() {
        System.out.print("x 좌표 : ");
        int inputX = sc.nextInt();
        System.out.print("y 좌표 : ");
        int inputY = sc.nextInt();
        System.out.print("반지름 : ");
        int inputRadius = sc.nextInt();
        String print = cc.calcCircum(inputX,inputY,inputRadius);
        System.out.println(print);

    }

    private void rectangleMenu() {
        System.out.println("===== 사각형 메뉴 =====");
        System.out.println("1. 사각형 둘레");
        System.out.println("2. 사각형 넓이");
        System.out.println("9. 메인으로");
        System.out.print("메뉴 번호 : ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                calcPerimeter();
                break;
            case 2:
                calcRectArea();
                break;
            case 9:
                System.out.println("메인으로 돌아갑니다.");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;

        }
    }

    private void calcPerimeter() {
        System.out.print("x 좌표 : ");
        int inputX = sc.nextInt();
        System.out.print("y 좌표 : ");
        int inputY = sc.nextInt();
        System.out.print("높이 : ");
        int inputHeight = sc.nextInt();
        System.out.print("너비 : ");
        int inputWidth = sc.nextInt();
        String print = rc.calcPerimeter(inputX,inputY,inputHeight,inputWidth);
        System.out.println(print);
    }

    private void calcRectArea() {
        System.out.print("x 좌표 : ");
        int inputX = sc.nextInt();
        System.out.print("y 좌표 : ");
        int inputY = sc.nextInt();
        System.out.print("높이 : ");
        int inputHeight = sc.nextInt();
        System.out.print("너비 : ");
        int inputWidth = sc.nextInt();
        String print = rc.calcArea(inputX,inputY,inputHeight,inputWidth);
        System.out.println(print);
    }

}
