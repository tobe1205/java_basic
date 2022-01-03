package day18.api.lang.obj;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone("갤럭시S21", "삼성", 1000000);
        Phone phone2 = new Phone("아이폰13", "애플", 1500000);
        Phone phone3 = new Phone("갤럭시노트", "삼성", 1200000);

        System.out.println(phone1 == phone2);

        //만약에 회사명이 같으면 같은객체로 보자!!
        System.out.println(phone1.equals(phone3));
        System.out.println(phone2);
        System.out.println(phone1.hashCode());
    }
}
