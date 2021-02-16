package com.library.models;

import java.util.Date;

public class Review {
    private Mark mark;
    private String text;
    private Date date;

    public Review(Mark mark, String text){
        this.mark = mark;
        this.text = text;
    }
    public Review(Mark mark){
        this.mark = mark;
        this.text = "";
    }

    public String getText() {
        return text;
    }
    public void setText(String text){
        this.text = text;
    }

    public Mark getMark() {
        return mark;
    }
    public void setMark(Mark mark){
        this.mark = mark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
