package com.kh.practice.list.library.model.vo;

import java.util.Objects;

public class Book implements Comparable<Book> {
    //Comparable인터페이스를 구현하면 비교기준을 만들 수 있음.

    private String title;
    private String author;
    private String category;
    private int price;

    public Book() {
    }

    public Book(String title, String author, String category, int price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(category, book.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, category, price);
    }

    @Override
    public String toString() {
        return String.format("(%s/%s/%s/%d)", title, author, category, price);
    }

    //정렬기준 메서드
    //this(앞에거)가 args(뒤에거)가 같으면 0
    //this가 크면 양수,작으면 음수
    public int compareTo(Book b) {
        //제목비교
        //비교대상1
        String t1 = this.title;
        //비교대상2
        String t2 = b.title;

        if (t1.equals(t2)) return 0;
        else if (t1.compareTo(t2) >= 1) return 1;
        else return -1;
    }
}
