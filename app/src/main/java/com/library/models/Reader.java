package com.library.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Reader extends Account{
    private String name = "";
    private String address = "";
    private Date birthDate;
    private ArrayList<Genre> favoriteGenres;
    private ArrayList<Author> favoriteAuthors;
    private ArrayList<Book> wishlist;
    private ArrayList<Review> reviews;
    private Purse purse;
    private ArrayList<Order> history;

    public Reader(String login, String password, String number, Base base) throws Exception{
        super(login, password, number, base);
        favoriteAuthors = new ArrayList<>();
        favoriteGenres = new ArrayList<>();
        wishlist = new ArrayList<>();
        reviews = new ArrayList<>();
        purse = new Purse();
        history = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public Date getBirthDate(){
        return  birthDate;
    }
    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
    }

    public void addReview(Review review){
        reviews.add(review);
    }

    public void removeReview(Review review){
        reviews.remove(review);
    }

    public Review getReview(int i) {
        return reviews.get(i);
    }

    public void addGenre(Genre genre) {
        favoriteGenres.add(genre);
    }

    public void removeGenre(Genre genre){
        favoriteGenres.remove(genre);
    }

    public Genre getGenre(int i){
        return favoriteGenres.get(i);
    }

    public Iterator<Genre> getGenres(){
        return favoriteGenres.iterator();
    }

    public Book getBook(int i) {
        return wishlist.get(i);
    }

    public void addBook(Book book){
        wishlist.add(book);
    }

    public void removeBook(Book book){
        wishlist.remove(book);
    }

    public Iterator<Book> getWishlist(){
        return  wishlist.iterator();
    }


    public void addAuthor(Author author) {
        favoriteAuthors.add(author);
    }

    public void removeAuthor(Author author){
        favoriteAuthors.remove(author);
    }

    public Author getAuthor(int i){
        return favoriteAuthors.get(i);
    }

    public Iterator<Author> getFavoriteAuthors(){
        return favoriteAuthors.iterator();
    }

    public void addOrder(Order order){
        history.add(order);
    }

    public void removeOrder(Order order){
        history.remove(order);
    }

    public Order getOrder(int i){
        return history.get(i);
    }

    public Iterator<Order> getHistory(){
        return history.iterator();
    }

    public Purse getPurse() {
        return purse;
    }
}
