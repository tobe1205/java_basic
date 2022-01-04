package com.kh.practice.list.library.view;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {

    static Scanner sc = new Scanner(System.in);
    BookController bc = new BookController();

    public void mainMenu(){
        while (true) {
            System.out.println("******* 메인 메뉴 ******");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서명 오름차순 정렬");
            System.out.println("9. 종료\n");
            System.out.print("메뉴 번호 입력 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1 :
                    insertBook();
                    break;
                case 2 :
                    selectList();
                    break;
                case 3 :
                    searchBook();
                    break;
                case 4 :
                    break;
                case 5 :
                    break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }


    private void insertBook() {
        System.out.println("===== 새 도서 추가 =====");
        System.out.println("책 정보를 입력하세요.");
        System.out.print("도서 명 : ");
        String title = sc.nextLine();
        sc.nextLine();
        System.out.print("저자 명 : ");
        String author = sc.nextLine();
        System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
        int menu = sc.nextInt();

        String category = null;
        switch (menu) {
            case 1 :
                category = "인문";
                break;
            case 2 :
                category = "과학";
                break;
            case 3 :
                category = "외국어";
                break;
            case 4 :
                category = "기타";
                break;
            default:
                System.out.println("장르를 다시 선택해주세요.");
        }
        System.out.print("가격 : ");
        int price = sc.nextInt();
        bc.insertBook(new Book(title,author,category,price));
    }

    //전체 리스트 출력
    private void selectList() {
        ArrayList books = bc.selectList();
        for (int i = 0; i < books.size() ; i++) {
            System.out.printf("%d번째 도서: %s\n", i + 1, books.get(i).toString());
        }
    }

    private void searchBook() {
        System.out.print("검색 키워드 : ");
        String keyword = sc.next();
        List<Book> searchList = bc.searchBook(keyword);
        if (searchList.size() == 0) {
            System.out.println("# 검색된 도서가 없습니다.");
        } else {
            System.out.printf("\n========검색 결과 (검색어 : %s)=======",keyword);
            for (Book b : searchList) {
                System.out.println(b.toString());
            }
        }
    }

}
