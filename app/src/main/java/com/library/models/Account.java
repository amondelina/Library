package com.library.models;

public class Account {
    protected String login;
    protected String password;
    protected String phoneNumber;

    public Account(String login, String password, String phoneNumber, Base base) throws Exception{
        setPhoneNumber(phoneNumber, base);
        setLogin(login, base);
        setPassword(password, base);
        base.addReader(this);
    }

    public String getLogin() {
       return login;
    }

    public void setLogin(String login, Base base) throws Exception {
        if(base.validateLogin(login))
            this.login = login;
        else
            throw new Exception("wrong login");

    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password, Base base) throws Exception {
        if(base.validatePassword(password))
            this.password = password;
        else
            throw new Exception("wrong password");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String number, Base base) throws Exception {
        if(base.validatePhoneNumber(number))
            this.phoneNumber = number;
        else
            throw new Exception("wrong number");
    }

    public void resetPassword(String password, String number, Base base){

    }



}
