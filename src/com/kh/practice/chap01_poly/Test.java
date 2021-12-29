package com.kh.practice.chap01_poly;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;


public class Test {

    public static void main(String[] args) {

        LibraryController lc = new LibraryController();


        //회원 생성
        Member kim = new Member("김철수", 15, 'M');

        //회원 가입
        lc.insertMember(kim);

        //회원 조회
        Member findMember = lc.myInfo();
        System.out.println(findMember);


        System.out.println("================");
        //도서목록 전체 조회

        Book[] books = lc.selectAll();
        for (Book b : books) {
            System.out.println(b.toString());
        }

        System.out.println("================");

        String str = "딸기우유 바나나우유 둘중에 뭘 먹지??";

        //문자열 내부에 특정 단어가 포함되어있는지 확인
        System.out.println(str.contains("메론"));

        Book[] searchBook = lc.searchBook("의");
        for (Book b : searchBook) {
            System.out.println(b.toString());
        }

        System.out.println("==========================");
        int flag = lc.rentBook(4);

        switch (flag) {
            case LibraryController.RENT_SUCCESS:
                System.out.println("대여 성공");
                break;
            case LibraryController.RENT_SUCCESS_WITH_COUPON:
                System.out.println("대여성공! 쿠폰 발급!!");
                break;
            default:
                System.out.println("대여 실패!!!");
        }
        System.out.println(kim.toString());
    }

}


