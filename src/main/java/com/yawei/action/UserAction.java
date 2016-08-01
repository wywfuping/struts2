package com.yawei.action;


import com.yawei.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class UserAction {

    private User user;
    private List<String> names;

    public String newUser(){
        System.out.println("user new");
        return "success";
    }

    public String save(){
        System.out.println("username"+user.getUsername()+"address:"+user.getAddress());
        return "success";
    }

    public String list(){
        System.out.println("user list ....");

        names = new ArrayList<>();
        names.add("wang");
        names.add("ya");
        names.add("wei");

        return "success";
    }

    //get set

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
