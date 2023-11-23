package com.test.spring6.iocxml.di;

public class Book {

    private String bname;
    private String author;

    public Book() {
    }

    public Book(String bname, String author) {
        this.bname = bname;
        this.author = author;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    // 原生方式注入属性
    public static void main(String[] args) {
        // set方法注入对象的属性
        Book book = new Book();
        book.setBname("java");
        book.setAuthor("Ao");

        // 通过构造器注入
        Book book1 = new Book("C++","Ao");

    }
}
