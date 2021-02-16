package com.library.models;

import java.util.Date;

public class Order {
    private Book book;
    private Reader reader;
    private Date startDate;
    private Date endDate;
    private Date factDate;
    private OrderStatus status;

    public Order(Book book, Reader reader, Date startDate, Date endDate, OrderStatus status){
        this.book = book;
        this.reader = reader;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public Book getBook(){
        return book;
    }

    public Reader getReader(){
        return reader;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Date getFactDate() {
        return factDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void end(Date date)
    {
        factDate = date;
        status = OrderStatus.ENDED;
    }
}
