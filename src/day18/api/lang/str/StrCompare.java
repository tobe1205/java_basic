package day18.api.lang.str;

import day15.poly.car.Sonata;

import java.util.Scanner;

public class StrCompare {

    static class User {
        String name;

        User(String name) {
            this.name = name;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            User user = new User("홍길동");

            System.out.print("- 이름 : ");
            String uName = sc.next();

            System.out.println("유저의 이름: " + user.name);
            System.out.println("입력한 이름: " + uName);
            System.out.println("== 으로 비교하기 : " + (user.name == uName));
            System.out.println("equals 로 비교하기 : " + (user.name.equals(uName)));

            uName.equals(new Sonata());

            sc.close();
        }
    }
}

