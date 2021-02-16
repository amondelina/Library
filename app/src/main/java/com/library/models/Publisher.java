package com.library.models;

import java.util.ArrayList;
import java.util.Iterator;

public class Publisher {
    private String name;
    private String information;
    private ArrayList<Book> books;

    public Publisher(){
        books = new ArrayList<>();
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public String getInformation() {
        return information;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook(int i) {
        return books.get(i);
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public Iterator<Book> getBooks(){
        return books.iterator();
    }
}
