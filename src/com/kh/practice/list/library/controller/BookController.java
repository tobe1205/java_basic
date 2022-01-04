package com.kh.practice.list.library.controller;

import com.kh.practice.list.library.model.vo.Book;

import java.util.ArrayList;
import java.util.List;

public class BookController {

    List<Book> bookList = new ArrayList<>();

    public BookController() {

        bookList.add(new Book("자바의 정석", "남궁성", "기타", 20000));
        bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
        bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
        bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
    }

    public void insertBook(Book bk){
        bookList.add(bk);
    }
    public ArrayList selectList(){
        return (ArrayList) bookList;
    }

    public ArrayList searchBook(String keyword){

        List<Book> searchList = new ArrayList(bookList.size());
        int count = 0; // 검색어의 걸린 횟수
        for (int i = 0; i < bookList.size(); i++) {

        }
        List<Book> searched = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            searched.add(i,bookList.get(i));
        }
        return (ArrayList) searched;
    }

}
