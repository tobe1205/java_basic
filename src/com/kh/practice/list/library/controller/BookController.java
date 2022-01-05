package com.kh.practice.list.library.controller;

import com.kh.practice.list.library.model.vo.Book;

import java.util.ArrayList;
import java.util.List;

public class BookController {

    private List<Book> bookList = new ArrayList<>();

    public BookController() {

        bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
        bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
        bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
        bookList.add(new Book("암 정복기", "박신우", "의료", 21000));

    }

    public void insertBook(Book bk) {
        bookList.add(bk);
    }
    public ArrayList<Book> selectList() {
        return (ArrayList<Book>) bookList;
    }
    public ArrayList<Book> searchBook(String keyword) {
        //검색결과 리스트 생성
        ArrayList<Book> searchList = new ArrayList<>();
        for (Book book : bookList) {
            //책 제목
            String title = book.getTitle();
            if (title.contains(keyword)) {
                searchList.add(book);
            }
        }
        return searchList;
    }
    public Book deleteBook(String title, String author) {
        //삭제될 도서를 담을 변수
        Book removeBook = null;
        for (Book book : bookList) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                removeBook = book;
                bookList.remove(book);
                break;
            }
        }
        return removeBook;
    }
    public int ascBook() {
        bookList.sort(Book::compareTo);
        return 1;
    }
}