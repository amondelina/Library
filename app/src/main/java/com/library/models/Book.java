package com.library.models;

import java.util.ArrayList;
import java.util.Iterator;

public class Book {
    private String title;
    private int pages;
    private String description;
    private Author author;
    private ArrayList<Genre> genres;
    private int year;
    private Publisher publisher;
    private ArrayList<Review> reviews;
    private int bond;
    private int rent;
    private ArrayList<Order> orders;
    private Boolean isFree;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setBond(int bond) {
        this.bond = bond;
    }

    public int getBond() {
        return bond;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
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

    public Iterator<Review> getReviews(){
        return reviews.iterator();
    }


    public void addGenre(Genre genre) {
        genres.add(genre);
    }

    public void removeGenre(Genre genre){
        genres.remove(genre);
    }

    public Genre getGenre(int i){
        return genres.get(i);
    }

    public Iterator<Order> getOrders(){
        return orders.iterator();
    }


    public void addOrder(Order order){
        orders.add(order);
    }

    public void removeOrder(Order order){
        orders.remove(order);
    }

    public Order getOrder(int i){
        return orders.get(i);
    }

}
