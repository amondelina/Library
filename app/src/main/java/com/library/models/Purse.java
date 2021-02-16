package com.library.models;

public class Purse {
    private int sum = 0;

    public void add(int money) throws Exception{
        if(money >= 0)
            sum += money;
        else throw new Exception("wrong sum");
    }

    public void withdraw(int money) throws Exception{
        if(money >= 0)
            sum -= money;
        else throw new Exception("wrong sum");
    }

    public int getSum(){
        return sum;
    }

}
