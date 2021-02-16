package com.library.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Author {
    private Date birthDate;
    private ArrayList<Book> books;
    private ArrayList<Genre> genres;
    private String biography;

    public Author(){
        books = new ArrayList<>();
        genres = new ArrayList<>();
    }
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
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


    public Genre getGenres(int i) {
        return genres.get(i);
    }

    public void removeGenre(Genre genre){
        genres.remove(genre);
    }

    public void addGenre(Genre genre){
        genres.add(genre);
    }

    public Iterator<Genre> getGenres(){
        return genres.iterator();
    }
}
