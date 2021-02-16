package com.library.models;

import java.util.List;
import java.util.TreeMap;

public class Base {
    private TreeMap<String, Account> base;

    public Base() throws Exception{
        base = new TreeMap<String, Account>();
        base.put("admin", new Account("admin", "adminadmin",
                "+375292420649", this));
    }
    public boolean validatePhoneNumber(String number){
        return true;
    }

    public boolean validateLogin(String login){
        return true;
    }

    public boolean validatePassword(String password){
        return true;
    }

    public void addReader(Account account) {
        base.put(account.getLogin(), account);
    }
    public void deleteReader(String login){
        base.remove(login);
    }
    public Reader findReader(String login){
        return (Reader)base.get(login);
    }
}
