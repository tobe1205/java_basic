package com.kh.practice.list.library;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        BookController bc = new BookController();
        bc.insertBook(new Book("뽀롱뽀로","김뽀로로","어린이",10000));

        Book deleteBook = bc.deleteBook("대화의 기술", "강보람");
        System.out.println("deleteBook = " + deleteBook);

        bc.ascBook();

        System.out.println("==============================");
        ArrayList<Book> books = bc.selectList();
        for (Book b : books) {
            System.out.println(b);

        }


    }
}
