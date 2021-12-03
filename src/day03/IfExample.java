package day03;

import java.util.Random;

public class IfExample {
    public static void main(String[] args) {

       Random r = new Random();

       int point = r.nextInt(101);
        System.out.println("점수 : " + point);
        if (point >= 60) {
            System.out.println("60점 이상입니다.");
            System.out.println("시험에 합격하셨습니다!!");
        } else {
            System.out.println("60점 미만입니다.");
            System.out.println("시험에 불합격했습니다 ㅠㅠ");
        }
        System.out.println("수고링~~");
    } // end main
} // end class
